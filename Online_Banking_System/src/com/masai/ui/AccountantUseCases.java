package com.masai.ui;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.AccountantDao;
import com.masai.dao.AccountantDaoImpl;
import com.masai.dto.Account;
import com.masai.dto.Customer;
import com.masai.dto.CustomerAccount;
import com.masai.exception.AccountantException;

public class AccountantUseCases {
	
	static void ViewAllCustomers() {
		
		AccountantDao dao = new AccountantDaoImpl();
		
		try {
			List<Customer> list = dao.viewAllCustomers();
			
			list.forEach(customer -> System.out.println(customer));
		
		} catch (AccountantException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	static void ViewByCustomerID(Scanner sc) {
		
		System.out.print("Enter Customer ID : ");
		int cid = Integer.parseInt(sc.nextLine());
		
		AccountantDao dao = new AccountantDaoImpl();
		
		try {
			CustomerAccount ca = dao.viewByCustomerID(cid);
			
			 System.out.println(ca);
		
		} catch (AccountantException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void ViewAccountByAccountNumber(Scanner sc) {
		
		System.out.print("Enter Account Number : ");
		int acc_num = Integer.parseInt(sc.nextLine());
		
		AccountantDao dao = new AccountantDaoImpl();
		
		try {
			Account ca = dao.viewAccountByAccountNumber(acc_num);
			
			 System.out.println(ca);
		
		} catch (AccountantException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void ViewAllAccounts() {
		
		AccountantDao dao = new AccountantDaoImpl();
		
		try {
			List<Account> accounts = dao.viewAllAccounts();
			
			accounts.forEach(account -> System.out.println(account));
		
		} catch (AccountantException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	

}
