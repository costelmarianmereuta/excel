package com.hendisantika.springbootexcelcsvpdf.controller;

import javax.servlet.http.HttpServletResponse;

import com.hendisantika.springbootexcelcsvpdf.service.ExcelOutputServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
@RequestMapping(value="/exceloutput")
public class ExcelOutputServiceController {

    @Autowired
    ExcelOutputServiceImpl excelOutputService;

    @RequestMapping(value="/download", method=RequestMethod.GET)
    public String downloadExcelOutputExl(HttpServletResponse response){

        excelOutputService.createExcelOutputExcel(response);
        return "je telecharge";
    }
}
