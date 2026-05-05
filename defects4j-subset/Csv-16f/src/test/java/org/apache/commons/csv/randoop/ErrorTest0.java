package org.apache.commons.csv.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat3", cSVFormat2.equals(cSVFormat3) ? cSVFormat2.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat11.printer();
        java.lang.Appendable appendable15 = cSVPrinter14.getOut();
        cSVFormat0.print((java.lang.Object) "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true", appendable15, true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVPrinter cSVPrinter22 = new org.apache.commons.csv.CSVPrinter(appendable15, cSVFormat20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat20 and cSVFormat21", cSVFormat20.equals(cSVFormat21) ? cSVFormat20.hashCode() == cSVFormat21.hashCode() : true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean5 = cSVFormat4.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat9.printer();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter12.print((java.lang.Object) cSVFormat13);
        java.lang.Appendable appendable15 = cSVPrinter12.getOut();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat21.printer();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter24.print((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean28 = cSVFormat27.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char33 = cSVFormat30.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean35 = cSVFormat34.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean43 = cSVFormat42.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withRecordSeparator(' ');
        java.lang.Object[] objArray49 = new java.lang.Object[] { cSVFormat37, 10L, (byte) 100, cSVFormat47, "hi!" };
        java.lang.String str50 = cSVFormat30.format(objArray49);
        cSVPrinter24.printRecord(objArray49);
        cSVFormat3.printRecord(appendable15, objArray49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat3", cSVFormat2.equals(cSVFormat3) ? cSVFormat2.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean11 = cSVFormat10.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withHeader(resultSet18);
        java.lang.String str20 = cSVFormat17.toString();
        boolean boolean21 = cSVFormat17.getIgnoreEmptyLines();
        boolean boolean22 = cSVFormat5.equals((java.lang.Object) boolean21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat6", cSVFormat5.equals(cSVFormat6) ? cSVFormat5.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase();
        java.lang.Character char10 = cSVFormat9.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        cSVPrinter12.printComment("");
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean16 = cSVFormat15.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator(' ');
        java.lang.Object obj21 = null;
        boolean boolean22 = cSVFormat20.equals(obj21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean25 = cSVFormat24.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter32 = cSVFormat29.printer();
        java.lang.Object[] objArray34 = new java.lang.Object[] { "hi!", cSVPrinter32, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat20.withHeaderComments(objArray34);
        cSVPrinter12.printRecord(objArray34);
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean39 = cSVFormat38.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet46 = null;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withHeader(resultSet46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat45.withIgnoreSurroundingSpaces(true);
        java.lang.Character char50 = cSVFormat49.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withIgnoreEmptyLines(true);
        java.lang.String[] strArray53 = cSVFormat49.getHeader();
        org.apache.commons.csv.CSVParser cSVParser54 = org.apache.commons.csv.CSVParser.parse("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!", cSVFormat49);
        java.util.Map<java.lang.String, java.lang.Integer> strMap55 = cSVParser54.getHeaderMap();
        cSVPrinter12.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean58 = cSVFormat57.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat57.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat57.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat62.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat63.withIgnoreHeaderCase();
        cSVPrinter12.print((java.lang.Object) cSVFormat66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat63 and cSVFormat66", cSVFormat63.equals(cSVFormat66) ? cSVFormat63.hashCode() == cSVFormat66.hashCode() : true);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withAllowMissingColumnNames(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat9", cSVFormat6.equals(cSVFormat9) ? cSVFormat6.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat9", cSVFormat6.equals(cSVFormat9) ? cSVFormat6.hashCode() == cSVFormat9.hashCode() : true);
    }
}

