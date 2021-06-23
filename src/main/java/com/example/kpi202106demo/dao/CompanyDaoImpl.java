package com.example.kpi202106demo.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.kpi202106demo.mapper.CompanyMapper;
import com.example.kpi202106demo.pojo.Company;
import org.springframework.stereotype.Service;

/**
 * @author 谭红超
 * @Description:
 * @since 2021-06-22 09:48
 */
@Service
public class CompanyDaoImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyDao{

}
