package com.mercor.xmlparser.service;

import com.mercor.xmlparser.entity.Employee;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;

import java.io.StringReader;

@Service
public class XmlParsingService {
    public Employee parseXmlToEmployee(String xml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Employee) unmarshaller.unmarshal(new StringReader(xml));
    }
}
