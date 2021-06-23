package com.example.kpi202106demo.service;


import com.example.kpi202106demo.pojo.Company;

import java.util.List;

public interface CompanyService {

    //查询所有
    List<Company> findAll();

    //单一查询
    Company findOne(String id);

    //更新
    void update(Company company);

    //添加
    void add(Company company);

    //删除
    void delete(String id);

}
