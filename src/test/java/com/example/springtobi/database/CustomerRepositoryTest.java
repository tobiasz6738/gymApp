package com.example.springtobi.database;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CustomerRepositoryTest
{

    @InjectMocks
    private CustomerRepository customerRepository;

    @Spy()
    private JdbcTemplate jdbcTemplate;

    @Before
    public void setUp()
    {
//        customerRepository = new CustomerRepository();
    }


    @Test
    public void test()
    {


        List<Jobs> all = customerRepository.findAll();

        all.size();

    }



}