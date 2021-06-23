package com.example.kpi202106demo.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.kpi202106demo.dao.CompanyDao;
import com.example.kpi202106demo.pojo.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> findAll() {
        List<Company> list = companyDao.list();
        return list;
    }

    @Override
    public Company findOne(String id) {
        Company byId = companyDao.getById(id);
        return byId;
    }

    @Override
    public void update(Company company) {
        UpdateWrapper<Company> wrapper = new UpdateWrapper<Company>()
                .set(Company.COL_CITY, "郑州")
                .eq(Company.COL_ID, 1);
        companyDao.update(wrapper);

    }

    @Override
    public void add(Company company) {
        companyDao.save(company);

    }

    @Override
    public void delete(String id) {
        companyDao.removeById(id);
    }
}
