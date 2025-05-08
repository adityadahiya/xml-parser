package com.mercor.xmlparser.mock;

public class XmlMockProvider {
    public static String getSampleXml() {
        return """
                <employee>
                <name>Aditya Dahiya</name>
                <age>30</age>
                <department>IT</department>
                <salary>50000</salary>
                </employee>
               """;
    }
}
