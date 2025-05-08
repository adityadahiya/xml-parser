package com.mercor.xmlparser.controller;

import com.mercor.xmlparser.entity.Employee;
import com.mercor.xmlparser.mock.XmlMockProvider;
import com.mercor.xmlparser.service.XmlParsingService;
import jakarta.xml.bind.JAXBException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class EmployeeController {

    @Autowired
    XmlParsingService xmlParsingService;

    @GetMapping("/employee")
    public Employee getEmployee() throws JAXBException {
        final String xml = XmlMockProvider.getSampleXml();
        final Employee employee = xmlParsingService.parseXmlToEmployee(xml);
        log.info("Employee: {}", employee);
        return employee;
    }
}
