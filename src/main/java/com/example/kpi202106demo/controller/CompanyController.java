package com.example.kpi202106demo.controller;

import com.example.kpi202106demo.pojo.Company;
import com.example.kpi202106demo.resp.Result;
import com.example.kpi202106demo.service.CompanyService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 谭红超
 * @Description:
 * @since 2021-06-22 10:32
 */
@Api(tags = "swagger示例 CRUD - 公司管理")
@RestController()
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    //查询所有
    @ApiOperation("获取公司列表")
    @GetMapping
    public List<Company> findAll(){
        return companyService.findAll();
    }

    //查询单一
    @ApiOperation(value = "根据id获取公司信息",notes = "id必须是数字")
    @ApiImplicitParams({@ApiImplicitParam(name = "id",value = "id",required = true/*,paramType = "path"*/)})
    @ApiResponses({@ApiResponse(code=400,message="id为空")})
    @GetMapping("/{id}")
    public Company findById(@PathVariable("id") String id){
        return companyService.findOne(id);
    }

    //添加
    @ApiOperation("新增公司信息")
    @ApiImplicitParam(name = "company", value = "单个公司信息", dataType = "Company")
    @PostMapping
    public Result add(@RequestBody Company company){
        try {
            companyService.add(company);
            return new Result(true,"新增成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"新增失败");
        }
    }

    //修改
    @ApiOperation("修改公司信息")
    @ApiImplicitParam(name = "company", value = "单个公司信息", dataType = "Company")
    @PutMapping
    public Result update(@RequestBody Company company){
        try {
            companyService.update(company);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    //删除
    @ApiOperation("删除用户")
    @ApiImplicitParam(name = "id", value = "单个用户信息", dataType = "String")
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
        try {
            companyService.delete(id);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }


}
