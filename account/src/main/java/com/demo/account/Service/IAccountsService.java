package com.demo.account.Service;

import com.demo.account.Dto.CustomerDto;

public interface IAccountsService {
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
