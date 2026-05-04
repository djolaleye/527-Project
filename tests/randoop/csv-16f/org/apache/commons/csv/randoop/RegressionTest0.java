package org.apache.commons.csv.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char6 = cSVFormat3.getEscapeCharacter();
        java.lang.Character char7 = cSVFormat3.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withHeader(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The header contains a duplicate entry: '' in [Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<??> SkipHeaderRecord:true, hi!, , ]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuote('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the quoteChar cannot be the same ('#')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char7 = cSVFormat4.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator(' ');
        java.lang.Object[] objArray23 = new java.lang.Object[] { cSVFormat11, 10L, (byte) 100, cSVFormat21, "hi!" };
        java.lang.String str24 = cSVFormat4.format(objArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser25 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!" + "'", str24, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat7.print((java.lang.Object) 1.0f, appendable9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        java.io.File file8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat6.print(file8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAllowMissingColumnNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6, 100L, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Default + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Default));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        java.sql.ResultSet resultSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter12.printRecords(resultSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.io.File file1 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter3 = cSVFormat0.print(file1, charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        boolean boolean9 = cSVFormat5.getAutoFlush();
        java.lang.String str10 = cSVFormat5.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", cSVPrinter17, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withHeaderComments(objArray19);
        boolean boolean21 = cSVFormat5.isNullStringSet();
        java.nio.file.Path path22 = null;
        java.nio.charset.Charset charset23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat5.print(path22, charset23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) 'a');
        java.lang.Character char10 = cSVFormat9.getEscapeCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'path' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(strArray8);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSetMetaData10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat6.printer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6, (long) (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVPrinter9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean8 = cSVFormat0.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator(' ');
        java.lang.Object obj8 = null;
        boolean boolean9 = cSVFormat7.equals(obj8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean12 = cSVFormat11.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter19 = cSVFormat16.printer();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "hi!", cSVPrinter19, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat7.withHeaderComments(objArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser23 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVPrinter19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSystemRecordSeparator();
        java.io.File file9 = null;
        java.nio.charset.Charset charset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat8.print(file9, charset10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSet10);
        java.lang.String str12 = cSVFormat9.toString();
        boolean boolean13 = cSVFormat9.isEscapeCharacterSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str12, "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter8.print((java.lang.Object) cSVFormat9);
        java.lang.Appendable appendable11 = cSVPrinter8.getOut();
        cSVPrinter8.flush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(appendable11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        java.lang.Appendable appendable9 = cSVPrinter8.getOut();
        cSVPrinter8.println();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(appendable9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withFirstRecordAsHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        boolean boolean9 = cSVFormat5.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withSkipHeaderRecord(false);
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\r\n" + "'", str12, "\r\n");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'path' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        boolean boolean3 = cSVFormat2.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        java.lang.Character char13 = cSVFormat10.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAllowMissingColumnNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape('4');
        java.lang.String str5 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str5, "Delimiter=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        boolean boolean8 = cSVFormat5.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuote('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote('a');
        boolean boolean7 = cSVFormat3.equals((java.lang.Object) cSVFormat6);
        java.lang.Class<?> wildcardClass8 = cSVFormat3.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<a> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<a> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSystemRecordSeparator();
        boolean boolean8 = cSVFormat6.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker('4');
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        boolean boolean9 = cSVFormat5.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSystemRecordSeparator();
        char char13 = cSVFormat11.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + ',' + "'", char13 == ',');
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        boolean boolean9 = cSVFormat5.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withSkipHeaderRecord(false);
        java.io.File file12 = null;
        java.nio.charset.Charset charset13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat5.print(file12, charset13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'path' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        java.nio.file.Path path6 = null;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.print(path6, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        boolean boolean6 = cSVFormat3.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(true);
        java.lang.String[] strArray12 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        java.lang.Class<?> wildcardClass10 = cSVFormat7.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        java.io.File file6 = null;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.print(file6, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode3 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAllowMissingColumnNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote((java.lang.Character) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(quoteMode3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeaderComments(objArray4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0]");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean8 = cSVFormat0.getTrailingDelimiter();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat0.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter8.print((java.lang.Object) cSVFormat9);
        java.lang.Appendable appendable11 = cSVPrinter8.getOut();
        java.lang.Appendable appendable12 = cSVPrinter8.getOut();
        java.lang.Appendable appendable13 = cSVPrinter8.getOut();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(appendable11);
        org.junit.Assert.assertNotNull(appendable12);
        org.junit.Assert.assertNotNull(appendable13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> QuoteChar=<\"> RecordSeparator=<??> SkipHeaderRecord:true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote('a');
        boolean boolean7 = cSVFormat3.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
        boolean boolean18 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean20 = cSVFormat19.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withRecordSeparator("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!");
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean34 = cSVFormat33.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean46 = cSVFormat45.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean55 = cSVFormat54.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat54.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter62 = cSVFormat59.printer();
        java.lang.Appendable appendable63 = cSVPrinter62.getOut();
        cSVFormat52.print((java.lang.Object) 0L, appendable63, false);
        cSVFormat44.println(appendable63);
        org.apache.commons.csv.CSVPrinter cSVPrinter67 = cSVFormat32.print(appendable63);
        org.apache.commons.csv.CSVFormat cSVFormat69 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat69.withIgnoreSurroundingSpaces();
        java.lang.Object[] objArray72 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat69.withHeaderComments(objArray72);
        cSVFormat0.printRecord(appendable63, objArray72);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVPrinter14);
        org.junit.Assert.assertNotNull(appendable15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVPrinter62);
        org.junit.Assert.assertNotNull(appendable63);
        org.junit.Assert.assertNotNull(cSVPrinter67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[0]");
        org.junit.Assert.assertNotNull(cSVFormat73);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", cSVPrinter17, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEscape('4');
        boolean boolean26 = cSVFormat20.equals((java.lang.Object) cSVFormat25);
        boolean boolean27 = cSVFormat25.getIgnoreEmptyLines();
        char char28 = cSVFormat25.getDelimiter();
        boolean boolean29 = cSVFormat25.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'a' + "'", char28 == 'a');
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote(' ');
        java.lang.String str6 = cSVFormat3.toString();
        boolean boolean7 = cSVFormat3.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat.Predefined predefined8 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat9 = predefined8.getFormat();
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        boolean boolean11 = cSVFormat3.equals((java.lang.Object) char10);
        boolean boolean12 = cSVFormat3.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str6, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + predefined8 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined8.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        boolean boolean6 = cSVFormat5.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
        java.sql.ResultSet resultSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter12.printRecords(resultSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        java.lang.String str10 = cSVFormat7.toString();
        boolean boolean11 = cSVFormat7.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str10, "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter8.print((java.lang.Object) cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean12 = cSVFormat11.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char17 = cSVFormat14.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean19 = cSVFormat18.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean27 = cSVFormat26.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withRecordSeparator(' ');
        java.lang.Object[] objArray33 = new java.lang.Object[] { cSVFormat21, 10L, (byte) 100, cSVFormat31, "hi!" };
        java.lang.String str34 = cSVFormat14.format(objArray33);
        cSVPrinter8.printRecord(objArray33);
        cSVPrinter8.printComment("Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!" + "'", str34, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withRecordSeparator('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char6 = cSVFormat3.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean16 = cSVFormat15.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator(' ');
        java.lang.Object[] objArray22 = new java.lang.Object[] { cSVFormat10, 10L, (byte) 100, cSVFormat20, "hi!" };
        java.lang.String str23 = cSVFormat3.format(objArray22);
        java.lang.String str24 = cSVFormat3.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!" + "'", str23, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\r\n" + "'", str24, "\r\n");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'inputStream' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat7.printer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'path' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVPrinter10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        java.lang.String str10 = cSVFormat7.toString();
        boolean boolean11 = cSVFormat7.getTrailingDelimiter();
        java.lang.Character char12 = cSVFormat7.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str10, "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(char12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        java.lang.String[] strArray8 = cSVFormat7.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withEscape('\"');
        java.lang.Class<?> wildcardClass11 = cSVFormat10.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        java.lang.Appendable appendable9 = cSVPrinter8.getOut();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat21.printer();
        java.lang.Appendable appendable25 = cSVPrinter24.getOut();
        cSVFormat10.print((java.lang.Object) "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true", appendable25, true);
        org.apache.commons.csv.CSVPrinter cSVPrinter28 = new org.apache.commons.csv.CSVPrinter(appendable9, cSVFormat10);
        cSVPrinter28.close();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(appendable9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVPrinter24);
        org.junit.Assert.assertNotNull(appendable25);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", cSVPrinter17, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEscape('4');
        boolean boolean26 = cSVFormat20.equals((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withSkipHeaderRecord();
        java.lang.Character char28 = cSVFormat20.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char6 = cSVFormat3.getEscapeCharacter();
        boolean boolean7 = cSVFormat3.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator(' ');
        java.lang.Object obj7 = null;
        boolean boolean8 = cSVFormat6.equals(obj7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean11 = cSVFormat10.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter18 = cSVFormat15.printer();
        java.lang.Object[] objArray20 = new java.lang.Object[] { "hi!", cSVPrinter18, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat6.withHeaderComments(objArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withEscape('4');
        boolean boolean27 = cSVFormat21.equals((java.lang.Object) cSVFormat26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat21.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean30 = cSVFormat29.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter37 = cSVFormat34.printer();
        cSVPrinter37.close();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean40 = cSVFormat39.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withRecordSeparator(' ');
        java.lang.Object obj45 = null;
        boolean boolean46 = cSVFormat44.equals(obj45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean49 = cSVFormat48.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter56 = cSVFormat53.printer();
        java.lang.Object[] objArray58 = new java.lang.Object[] { "hi!", cSVPrinter56, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat44.withHeaderComments(objArray58);
        cSVPrinter37.printRecords(objArray58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat21.withHeaderComments(objArray58);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser62 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVPrinter18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVPrinter37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVPrinter56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVPrinter cSVPrinter3 = cSVFormat2.printer();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVPrinter3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAllowMissingColumnNames(false);
        java.lang.String[] strArray9 = cSVFormat8.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape('\"');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char15 = cSVFormat12.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean25 = cSVFormat24.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withRecordSeparator(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { cSVFormat19, 10L, (byte) 100, cSVFormat29, "hi!" };
        java.lang.String str32 = cSVFormat12.format(objArray31);
        java.lang.String str33 = cSVFormat8.format(objArray31);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (byte) 100, (byte) -1, 100.0d };
        java.lang.String str38 = cSVFormat8.format(objArray37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat8.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!" + "'", str32, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!" + "'", str33, "Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[100, -1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[100, -1, 100.0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "100,-1,100.0" + "'", str38, "100,-1,100.0");
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean15 = cSVFormat14.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean27 = cSVFormat26.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean36 = cSVFormat35.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter43 = cSVFormat40.printer();
        java.lang.Appendable appendable44 = cSVPrinter43.getOut();
        cSVFormat33.print((java.lang.Object) 0L, appendable44, false);
        cSVFormat25.println(appendable44);
        org.apache.commons.csv.CSVPrinter cSVPrinter48 = cSVFormat13.print(appendable44);
        java.lang.Appendable appendable49 = cSVPrinter48.getOut();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVPrinter43);
        org.junit.Assert.assertNotNull(appendable44);
        org.junit.Assert.assertNotNull(cSVPrinter48);
        org.junit.Assert.assertNotNull(appendable49);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter8.print((java.lang.Object) cSVFormat9);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = cSVFormat9.parse(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator(' ');
        java.lang.Object obj8 = null;
        boolean boolean9 = cSVFormat7.equals(obj8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'path' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
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
        java.lang.Appendable appendable37 = cSVPrinter12.getOut();
        cSVPrinter12.print((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVPrinter32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(appendable37);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(strArray8);
        boolean boolean10 = cSVFormat9.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat7.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withHeader(resultSet17);
        java.lang.String str19 = cSVFormat16.toString();
        org.apache.commons.csv.CSVFormat.Predefined predefined20 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat21 = predefined20.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.QuoteMode quoteMode24 = cSVFormat23.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat16.withQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat7.withQuoteMode(quoteMode24);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str8, "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str19, "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("'" + predefined20 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined20.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + quoteMode24 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode24.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        java.lang.String str7 = cSVFormat0.toString();
        java.io.File file8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat0.print(file8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        java.lang.String[] strArray8 = cSVFormat7.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('#');
        java.nio.file.Path path8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat5.print(path8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat13.printer();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter16.print((java.lang.Object) cSVFormat17);
        java.lang.Appendable appendable19 = cSVPrinter16.getOut();
        java.lang.Appendable appendable20 = cSVPrinter16.getOut();
        org.apache.commons.csv.CSVFormat.Predefined predefined21 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = predefined21.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean24 = cSVFormat23.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter31 = cSVFormat28.printer();
        cSVPrinter31.close();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean34 = cSVFormat33.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withRecordSeparator(' ');
        java.lang.Object obj39 = null;
        boolean boolean40 = cSVFormat38.equals(obj39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean43 = cSVFormat42.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter50 = cSVFormat47.printer();
        java.lang.Object[] objArray52 = new java.lang.Object[] { "hi!", cSVPrinter50, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat38.withHeaderComments(objArray52);
        cSVPrinter31.printRecords(objArray52);
        java.lang.String str55 = cSVFormat22.format(objArray52);
        cSVFormat7.printRecord(appendable20, objArray52);
        org.apache.commons.csv.CSVPrinter cSVPrinter57 = cSVFormat7.printer();
        cSVPrinter57.close();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVPrinter16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(appendable19);
        org.junit.Assert.assertNotNull(appendable20);
        org.junit.Assert.assertTrue("'" + predefined21 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined21.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVPrinter31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVPrinter50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVPrinter57);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean11 = cSVFormat10.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) 'a');
        boolean boolean16 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean18 = cSVFormat17.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuote(' ');
        java.lang.String str23 = cSVFormat20.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean27 = cSVFormat26.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter34 = cSVFormat31.printer();
        cSVPrinter34.close();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean37 = cSVFormat36.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withRecordSeparator(' ');
        java.lang.Object obj42 = null;
        boolean boolean43 = cSVFormat41.equals(obj42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean46 = cSVFormat45.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter53 = cSVFormat50.printer();
        java.lang.Object[] objArray55 = new java.lang.Object[] { "hi!", cSVPrinter53, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat41.withHeaderComments(objArray55);
        cSVPrinter34.printRecords(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat25.withHeaderComments(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat13.withHeaderComments(objArray55);
        java.lang.String str60 = cSVFormat6.format(objArray55);
        java.lang.String str61 = cSVFormat6.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVPrinter34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVPrinter53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", cSVPrinter17, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEscape('4');
        boolean boolean26 = cSVFormat20.equals((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean29 = cSVFormat28.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter36 = cSVFormat33.printer();
        cSVPrinter36.close();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean39 = cSVFormat38.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withRecordSeparator(' ');
        java.lang.Object obj44 = null;
        boolean boolean45 = cSVFormat43.equals(obj44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean48 = cSVFormat47.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat47.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter55 = cSVFormat52.printer();
        java.lang.Object[] objArray57 = new java.lang.Object[] { "hi!", cSVPrinter55, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat43.withHeaderComments(objArray57);
        cSVPrinter36.printRecords(objArray57);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat20.withHeaderComments(objArray57);
        boolean boolean61 = cSVFormat20.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVPrinter36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVPrinter55);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowMissingColumnNames(false);
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", cSVPrinter17, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat5.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        cSVPrinter12.flush();
        cSVPrinter12.print((java.lang.Object) '4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat21.printer();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withNullString("Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean28 = cSVFormat27.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat27.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData33 = null;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withHeader(resultSetMetaData33);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withHeader(strArray35);
        java.lang.String str37 = cSVFormat26.format((java.lang.Object[]) strArray35);
        cSVPrinter12.printRecords((java.lang.Object[]) strArray35);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVPrinter24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker((java.lang.Character) '\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the quoteChar cannot be the same ('\"')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces();
        java.lang.String[] strArray9 = cSVFormat8.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        java.lang.String[] strArray8 = cSVFormat7.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean20 = cSVFormat19.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter27 = cSVFormat24.printer();
        java.lang.Appendable appendable28 = cSVPrinter27.getOut();
        cSVFormat13.print((java.lang.Object) "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true", appendable28, true);
        java.lang.Object[] objArray31 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat12.printRecord(appendable28, objArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVPrinter27);
        org.junit.Assert.assertNotNull(appendable28);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) 'a');
        java.lang.Character char9 = cSVFormat8.getEscapeCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withHeader(resultSetMetaData9);
        boolean boolean11 = cSVFormat10.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        java.lang.Character char8 = cSVFormat7.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        boolean boolean3 = cSVFormat2.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat2.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote(' ');
        java.lang.String str6 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        cSVPrinter17.close();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean20 = cSVFormat19.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator(' ');
        java.lang.Object obj25 = null;
        boolean boolean26 = cSVFormat24.equals(obj25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean29 = cSVFormat28.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter36 = cSVFormat33.printer();
        java.lang.Object[] objArray38 = new java.lang.Object[] { "hi!", cSVPrinter36, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat24.withHeaderComments(objArray38);
        cSVPrinter17.printRecords(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat8.withHeaderComments(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean43 = cSVFormat42.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat42.withIgnoreEmptyLines(false);
        boolean boolean50 = cSVFormat42.isQuoteCharacterSet();
        java.lang.String[] strArray51 = cSVFormat42.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean53 = cSVFormat52.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat52.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean65 = cSVFormat64.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat64.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat73 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean74 = cSVFormat73.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat73.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat78.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter81 = cSVFormat78.printer();
        java.lang.Appendable appendable82 = cSVPrinter81.getOut();
        cSVFormat71.print((java.lang.Object) 0L, appendable82, false);
        cSVFormat63.println(appendable82);
        cSVFormat41.print((java.lang.Object) strArray51, appendable82, true);
        boolean boolean88 = cSVFormat41.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVPrinter36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVPrinter81);
        org.junit.Assert.assertNotNull(appendable82);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat6.printer();
        boolean boolean10 = cSVFormat6.getAutoFlush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVPrinter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        cSVPrinter12.flush();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean15 = cSVFormat14.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator(' ');
        java.lang.Object obj20 = null;
        boolean boolean21 = cSVFormat19.equals(obj20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean24 = cSVFormat23.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter31 = cSVFormat28.printer();
        java.lang.Object[] objArray33 = new java.lang.Object[] { "hi!", cSVPrinter31, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat19.withHeaderComments(objArray33);
        cSVPrinter12.printRecord(objArray33);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVPrinter31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(cSVFormat34);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        boolean boolean9 = cSVFormat5.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withSkipHeaderRecord(false);
        java.lang.String[] strArray12 = cSVFormat11.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuote('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'path' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'path' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withNullString("Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
        boolean boolean11 = cSVFormat10.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat13.printer();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter16.print((java.lang.Object) cSVFormat17);
        java.lang.Appendable appendable19 = cSVPrinter16.getOut();
        java.lang.Appendable appendable20 = cSVPrinter16.getOut();
        org.apache.commons.csv.CSVFormat.Predefined predefined21 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = predefined21.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean24 = cSVFormat23.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter31 = cSVFormat28.printer();
        cSVPrinter31.close();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean34 = cSVFormat33.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withRecordSeparator(' ');
        java.lang.Object obj39 = null;
        boolean boolean40 = cSVFormat38.equals(obj39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean43 = cSVFormat42.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter50 = cSVFormat47.printer();
        java.lang.Object[] objArray52 = new java.lang.Object[] { "hi!", cSVPrinter50, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat38.withHeaderComments(objArray52);
        cSVPrinter31.printRecords(objArray52);
        java.lang.String str55 = cSVFormat22.format(objArray52);
        cSVFormat7.printRecord(appendable20, objArray52);
        boolean boolean57 = cSVFormat7.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVPrinter16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(appendable19);
        org.junit.Assert.assertNotNull(appendable20);
        org.junit.Assert.assertTrue("'" + predefined21 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined21.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVPrinter31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVPrinter50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        boolean boolean9 = cSVFormat5.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAutoFlush(false);
        java.io.File file5 = null;
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat2.print(file5, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true> SkipHeaderRecord:false", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAllowMissingColumnNames(true);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MySQL + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MySQL));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char15 = cSVFormat12.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean25 = cSVFormat24.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withRecordSeparator(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { cSVFormat19, 10L, (byte) 100, cSVFormat29, "hi!" };
        java.lang.String str32 = cSVFormat12.format(objArray31);
        java.lang.String str33 = cSVFormat8.format(objArray31);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (byte) 100, (byte) -1, 100.0d };
        java.lang.String str38 = cSVFormat8.format(objArray37);
        java.lang.String[] strArray39 = cSVFormat8.getHeaderComments();
        boolean boolean40 = cSVFormat8.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!" + "'", str32, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!" + "'", str33, "Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[100, -1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[100, -1, 100.0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "100,-1,100.0" + "'", str38, "100,-1,100.0");
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<??> SkipHeaderRecord:true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat7.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        java.lang.String str10 = cSVFormat7.toString();
        boolean boolean11 = cSVFormat7.isEscapeCharacterSet();
        boolean boolean12 = cSVFormat7.isEscapeCharacterSet();
        boolean boolean13 = cSVFormat7.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str10, "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        cSVPrinter8.close();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean11 = cSVFormat10.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) 'a');
        boolean boolean16 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean18 = cSVFormat17.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuote(' ');
        java.lang.String str23 = cSVFormat20.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean27 = cSVFormat26.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter34 = cSVFormat31.printer();
        cSVPrinter34.close();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean37 = cSVFormat36.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withRecordSeparator(' ');
        java.lang.Object obj42 = null;
        boolean boolean43 = cSVFormat41.equals(obj42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean46 = cSVFormat45.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter53 = cSVFormat50.printer();
        java.lang.Object[] objArray55 = new java.lang.Object[] { "hi!", cSVPrinter53, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat41.withHeaderComments(objArray55);
        cSVPrinter34.printRecords(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat25.withHeaderComments(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat13.withHeaderComments(objArray55);
        cSVPrinter8.printRecords(objArray55);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVPrinter34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVPrinter53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(true);
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withDelimiter(',');
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat11.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(quoteMode15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
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
        java.lang.Character char18 = cSVFormat0.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVPrinter14);
        org.junit.Assert.assertNotNull(appendable15);
        org.junit.Assert.assertNull(char18);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean8 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter17.print((java.lang.Object) cSVFormat18);
        java.lang.Appendable appendable20 = cSVPrinter17.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter21 = cSVFormat0.print(appendable20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat0.withCommentMarker((java.lang.Character) 'a');
        java.lang.String[] strArray26 = cSVFormat25.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(appendable20);
        org.junit.Assert.assertNotNull(cSVPrinter21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(strArray26);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        cSVPrinter12.flush();
        cSVPrinter12.print((java.lang.Object) '4');
        cSVPrinter12.println();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator(' ');
        java.lang.Object obj8 = null;
        boolean boolean9 = cSVFormat7.equals(obj8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean12 = cSVFormat11.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter19 = cSVFormat16.printer();
        java.lang.Object[] objArray21 = new java.lang.Object[] { "hi!", cSVPrinter19, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat7.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withEscape('4');
        boolean boolean28 = cSVFormat22.equals((java.lang.Object) cSVFormat27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat22.withSkipHeaderRecord();
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser31 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'inputStream' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVPrinter19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode3 = cSVFormat1.getQuoteMode();
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(quoteMode3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        java.lang.String str10 = cSVFormat7.toString();
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = cSVFormat7.parse(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true> SkipHeaderRecord:false" + "'", str10, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true> SkipHeaderRecord:false");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAllowMissingColumnNames(false);
        java.lang.String[] strArray9 = cSVFormat8.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape('\"');
        org.apache.commons.csv.CSVFormat.Predefined predefined12 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat13 = predefined12.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.QuoteMode quoteMode16 = cSVFormat15.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withQuoteMode(quoteMode16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + predefined12 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined12.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + quoteMode16 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode16.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        cSVPrinter8.close();
        cSVPrinter8.close();
        cSVPrinter8.println();
        cSVPrinter8.close();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter8.print((java.lang.Object) cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean14 = cSVFormat13.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSkipHeaderRecord(true);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, (short) -1, cSVFormat13, 'a' };
        cSVPrinter8.printRecord(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean22 = cSVFormat21.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuote((java.lang.Character) 'a');
        java.lang.Character char29 = cSVFormat28.getEscapeCharacter();
        org.apache.commons.csv.CSVParser cSVParser30 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat28);
        cSVPrinter8.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean33 = cSVFormat32.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withQuote((java.lang.Character) 'a');
        cSVPrinter8.print((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVParser30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", cSVPrinter17, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEscape('4');
        boolean boolean26 = cSVFormat20.equals((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withNullString("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withNullString("Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('\"');
        java.nio.file.Path path13 = null;
        java.nio.charset.Charset charset14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat12.print(path13, charset14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char15 = cSVFormat12.getEscapeCharacter();
        boolean boolean16 = cSVFormat12.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean18 = cSVFormat17.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter25 = cSVFormat22.printer();
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter25.print((java.lang.Object) cSVFormat26);
        java.lang.Appendable appendable28 = cSVPrinter25.getOut();
        java.lang.Appendable appendable29 = cSVPrinter25.getOut();
        cSVFormat5.print((java.lang.Object) boolean16, appendable29, true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\r\n" + "'", str8, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVPrinter25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(appendable28);
        org.junit.Assert.assertNotNull(appendable29);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String str2 = cSVFormat1.getNullString();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        java.lang.String str10 = cSVFormat7.toString();
        boolean boolean11 = cSVFormat7.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true> SkipHeaderRecord:false" + "'", str10, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator("Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter8.print((java.lang.Object) cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean14 = cSVFormat13.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSkipHeaderRecord(true);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, (short) -1, cSVFormat13, 'a' };
        cSVPrinter8.printRecord(objArray18);
        cSVPrinter8.close();
        cSVPrinter8.close(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode3 = cSVFormat2.getQuoteMode();
        boolean boolean4 = cSVFormat2.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(quoteMode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", cSVPrinter17, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withHeaderComments(objArray19);
        java.lang.String str21 = cSVFormat20.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        cSVPrinter8.close();
        cSVPrinter8.println();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSystemRecordSeparator();
        boolean boolean8 = cSVFormat6.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withAllowMissingColumnNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter17.print((java.lang.Object) cSVFormat18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean23 = cSVFormat22.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withSkipHeaderRecord(true);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 1, (short) -1, cSVFormat22, 'a' };
        cSVPrinter17.printRecord(objArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat5.withHeaderComments(objArray27);
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean14 = cSVFormat13.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter21 = cSVFormat18.printer();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter21.print((java.lang.Object) cSVFormat22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean25 = cSVFormat24.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char30 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean32 = cSVFormat31.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean40 = cSVFormat39.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withRecordSeparator(' ');
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat34, 10L, (byte) 100, cSVFormat44, "hi!" };
        java.lang.String str47 = cSVFormat27.format(objArray46);
        cSVPrinter21.printRecord(objArray46);
        cSVPrinter12.printRecord(objArray46);
        cSVPrinter12.flush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVPrinter21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(char30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!" + "'", str47, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        boolean boolean8 = cSVFormat7.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char7 = cSVFormat4.getEscapeCharacter();
        boolean boolean8 = cSVFormat4.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreHeaderCase();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSet10);
        java.lang.String str12 = cSVFormat9.toString();
        boolean boolean13 = cSVFormat9.isEscapeCharacterSet();
        boolean boolean14 = cSVFormat9.isCommentMarkerSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str12, "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char6 = cSVFormat3.getEscapeCharacter();
        boolean boolean7 = cSVFormat3.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withQuote((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat5.getQuoteMode();
        boolean boolean8 = cSVFormat5.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(quoteMode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        cSVPrinter8.close();
        cSVPrinter8.close();
        cSVPrinter8.printComment("Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote(' ');
        java.lang.String str13 = cSVFormat10.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat21.printer();
        cSVPrinter24.close();
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean27 = cSVFormat26.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withRecordSeparator(' ');
        java.lang.Object obj32 = null;
        boolean boolean33 = cSVFormat31.equals(obj32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean36 = cSVFormat35.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter43 = cSVFormat40.printer();
        java.lang.Object[] objArray45 = new java.lang.Object[] { "hi!", cSVPrinter43, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat31.withHeaderComments(objArray45);
        cSVPrinter24.printRecords(objArray45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat15.withHeaderComments(objArray45);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat3.withHeaderComments(objArray45);
        boolean boolean50 = cSVFormat49.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVPrinter24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVPrinter43);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote(' ');
        java.lang.String str6 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        cSVPrinter17.close();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean20 = cSVFormat19.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator(' ');
        java.lang.Object obj25 = null;
        boolean boolean26 = cSVFormat24.equals(obj25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean29 = cSVFormat28.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter36 = cSVFormat33.printer();
        java.lang.Object[] objArray38 = new java.lang.Object[] { "hi!", cSVPrinter36, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat24.withHeaderComments(objArray38);
        cSVPrinter17.printRecords(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat8.withHeaderComments(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat8.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVPrinter36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuote('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        java.lang.String str13 = cSVFormat10.toString();
        org.apache.commons.csv.CSVFormat.Predefined predefined14 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat15 = predefined14.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.QuoteMode quoteMode18 = cSVFormat17.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withQuoteMode(quoteMode18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat0.withQuoteMode(quoteMode18);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str13, "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("'" + predefined14 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined14.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + quoteMode18 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode18.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withIgnoreEmptyLines(false);
        boolean boolean15 = cSVFormat7.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat21.printer();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter24.print((java.lang.Object) cSVFormat25);
        java.lang.Appendable appendable27 = cSVPrinter24.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter28 = cSVFormat7.print(appendable27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat7.withCommentMarker((java.lang.Character) 'a');
        boolean boolean33 = cSVFormat5.equals((java.lang.Object) cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVPrinter24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(appendable27);
        org.junit.Assert.assertNotNull(cSVPrinter28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", cSVPrinter17, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEscape('4');
        boolean boolean26 = cSVFormat20.equals((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withSkipHeaderRecord();
        java.lang.String[] strArray28 = cSVFormat27.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        boolean boolean9 = cSVFormat5.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean6 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withFirstRecordAsHeader();
        boolean boolean8 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withQuote('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withQuote((java.lang.Character) ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.lang.Character char8 = cSVFormat7.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withEscape('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote(' ');
        java.lang.String str13 = cSVFormat10.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat21.printer();
        cSVPrinter24.close();
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean27 = cSVFormat26.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withRecordSeparator(' ');
        java.lang.Object obj32 = null;
        boolean boolean33 = cSVFormat31.equals(obj32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean36 = cSVFormat35.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter43 = cSVFormat40.printer();
        java.lang.Object[] objArray45 = new java.lang.Object[] { "hi!", cSVPrinter43, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat31.withHeaderComments(objArray45);
        cSVPrinter24.printRecords(objArray45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat15.withHeaderComments(objArray45);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat3.withHeaderComments(objArray45);
        java.lang.String str50 = cSVFormat3.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVPrinter24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVPrinter43);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\r\n" + "'", str50, "\r\n");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator("Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean6 = cSVFormat5.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(resultSet13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat16.printer();
        cSVPrinter17.printComment("");
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean21 = cSVFormat20.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator(' ');
        java.lang.Object obj26 = null;
        boolean boolean27 = cSVFormat25.equals(obj26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean30 = cSVFormat29.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter37 = cSVFormat34.printer();
        java.lang.Object[] objArray39 = new java.lang.Object[] { "hi!", cSVPrinter37, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat25.withHeaderComments(objArray39);
        cSVPrinter17.printRecord(objArray39);
        java.lang.Appendable appendable42 = cSVPrinter17.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter43 = cSVFormat0.print(appendable42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVPrinter37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(appendable42);
        org.junit.Assert.assertNotNull(cSVPrinter43);
        org.junit.Assert.assertNotNull(cSVFormat45);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", cSVPrinter17, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEscape('4');
        boolean boolean26 = cSVFormat20.equals((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean29 = cSVFormat28.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean38 = cSVFormat37.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter45 = cSVFormat42.printer();
        java.lang.Appendable appendable46 = cSVPrinter45.getOut();
        cSVFormat35.print((java.lang.Object) 0L, appendable46, false);
        org.apache.commons.csv.CSVFormat.Predefined predefined49 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat50 = predefined49.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean52 = cSVFormat51.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat51.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter59 = cSVFormat56.printer();
        cSVPrinter59.close();
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean62 = cSVFormat61.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withRecordSeparator(' ');
        java.lang.Object obj67 = null;
        boolean boolean68 = cSVFormat66.equals(obj67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean71 = cSVFormat70.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat70.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat73.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat75.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter78 = cSVFormat75.printer();
        java.lang.Object[] objArray80 = new java.lang.Object[] { "hi!", cSVPrinter78, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat66.withHeaderComments(objArray80);
        cSVPrinter59.printRecords(objArray80);
        java.lang.String str83 = cSVFormat50.format(objArray80);
        cSVFormat20.printRecord(appendable46, objArray80);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat20.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVPrinter45);
        org.junit.Assert.assertNotNull(appendable46);
        org.junit.Assert.assertTrue("'" + predefined49 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined49.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVPrinter59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVPrinter78);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(cSVFormat86);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean15 = cSVFormat14.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean27 = cSVFormat26.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean36 = cSVFormat35.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter43 = cSVFormat40.printer();
        java.lang.Appendable appendable44 = cSVPrinter43.getOut();
        cSVFormat33.print((java.lang.Object) 0L, appendable44, false);
        cSVFormat25.println(appendable44);
        org.apache.commons.csv.CSVPrinter cSVPrinter48 = cSVFormat13.print(appendable44);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat13.withCommentMarker(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVPrinter43);
        org.junit.Assert.assertNotNull(appendable44);
        org.junit.Assert.assertNotNull(cSVPrinter48);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeaderComments(objArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0]");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'path' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        cSVPrinter8.close();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean11 = cSVFormat10.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator(' ');
        java.lang.Object obj16 = null;
        boolean boolean17 = cSVFormat15.equals(obj16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean20 = cSVFormat19.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter27 = cSVFormat24.printer();
        java.lang.Object[] objArray29 = new java.lang.Object[] { "hi!", cSVPrinter27, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat15.withHeaderComments(objArray29);
        cSVPrinter8.printRecords(objArray29);
        cSVPrinter8.printComment("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean35 = cSVFormat34.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet42 = null;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withHeader(resultSet42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter46 = cSVFormat45.printer();
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean48 = cSVFormat47.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat47.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter55 = cSVFormat52.printer();
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter55.print((java.lang.Object) cSVFormat56);
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean59 = cSVFormat58.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat58.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char64 = cSVFormat61.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean66 = cSVFormat65.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat65.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat68.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat73 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean74 = cSVFormat73.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat73.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withRecordSeparator(' ');
        java.lang.Object[] objArray80 = new java.lang.Object[] { cSVFormat68, 10L, (byte) 100, cSVFormat78, "hi!" };
        java.lang.String str81 = cSVFormat61.format(objArray80);
        cSVPrinter55.printRecord(objArray80);
        cSVPrinter46.printRecord(objArray80);
        cSVPrinter8.printRecords(objArray80);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVPrinter27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVPrinter46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVPrinter55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNull(char64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!" + "'", str81, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode3 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAllowMissingColumnNames();
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        char char6 = cSVFormat1.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(quoteMode3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", cSVPrinter17, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEscape('4');
        boolean boolean26 = cSVFormat20.equals((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withAllowMissingColumnNames();
        java.io.File file28 = null;
        java.nio.charset.Charset charset29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter30 = cSVFormat27.print(file28, charset29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeaderComments(objArray4);
        boolean boolean6 = cSVFormat1.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0]");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(strArray8);
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote(' ');
        java.lang.String str6 = cSVFormat3.toString();
        boolean boolean7 = cSVFormat3.isCommentMarkerSet();
        char char8 = cSVFormat3.getDelimiter();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withHeader(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str6, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote(' ');
        java.lang.String str6 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withAllowMissingColumnNames(true);
        boolean boolean15 = cSVFormat9.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withFirstRecordAsHeader();
        boolean boolean17 = cSVFormat9.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean19 = cSVFormat18.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat18.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean27 = cSVFormat26.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat26.withIgnoreEmptyLines(false);
        boolean boolean34 = cSVFormat26.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean36 = cSVFormat35.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter43 = cSVFormat40.printer();
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter43.print((java.lang.Object) cSVFormat44);
        java.lang.Appendable appendable46 = cSVPrinter43.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter47 = cSVFormat26.print(appendable46);
        org.apache.commons.csv.CSVPrinter cSVPrinter48 = cSVFormat18.print(appendable46);
        cSVFormat3.print((java.lang.Object) cSVFormat9, appendable46, false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVPrinter43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(appendable46);
        org.junit.Assert.assertNotNull(cSVPrinter47);
        org.junit.Assert.assertNotNull(cSVPrinter48);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(true);
        java.lang.String[] strArray12 = cSVFormat9.getHeader();
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat9.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreEmptyLines();
        java.lang.String[] strArray7 = cSVFormat5.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat13.printer();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter16.print((java.lang.Object) cSVFormat17);
        java.lang.Appendable appendable19 = cSVPrinter16.getOut();
        java.lang.Appendable appendable20 = cSVPrinter16.getOut();
        org.apache.commons.csv.CSVFormat.Predefined predefined21 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = predefined21.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean24 = cSVFormat23.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter31 = cSVFormat28.printer();
        cSVPrinter31.close();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean34 = cSVFormat33.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withRecordSeparator(' ');
        java.lang.Object obj39 = null;
        boolean boolean40 = cSVFormat38.equals(obj39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean43 = cSVFormat42.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter50 = cSVFormat47.printer();
        java.lang.Object[] objArray52 = new java.lang.Object[] { "hi!", cSVPrinter50, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat38.withHeaderComments(objArray52);
        cSVPrinter31.printRecords(objArray52);
        java.lang.String str55 = cSVFormat22.format(objArray52);
        cSVFormat7.printRecord(appendable20, objArray52);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat7.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVPrinter16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(appendable19);
        org.junit.Assert.assertNotNull(appendable20);
        org.junit.Assert.assertTrue("'" + predefined21 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined21.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVPrinter31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVPrinter50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat58);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withNullString("Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean12 = cSVFormat11.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withHeader(resultSetMetaData17);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat10.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSystemRecordSeparator();
        boolean boolean8 = cSVFormat6.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withAllowMissingColumnNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat10, (long) 'a', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean11 = cSVFormat10.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) 'a');
        boolean boolean16 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean18 = cSVFormat17.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuote(' ');
        java.lang.String str23 = cSVFormat20.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean27 = cSVFormat26.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter34 = cSVFormat31.printer();
        cSVPrinter34.close();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean37 = cSVFormat36.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withRecordSeparator(' ');
        java.lang.Object obj42 = null;
        boolean boolean43 = cSVFormat41.equals(obj42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean46 = cSVFormat45.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter53 = cSVFormat50.printer();
        java.lang.Object[] objArray55 = new java.lang.Object[] { "hi!", cSVPrinter53, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat41.withHeaderComments(objArray55);
        cSVPrinter34.printRecords(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat25.withHeaderComments(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat13.withHeaderComments(objArray55);
        java.lang.String str60 = cSVFormat6.format(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVPrinter34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVPrinter53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat62);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<??>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        java.lang.Appendable appendable9 = cSVPrinter8.getOut();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat21.printer();
        java.lang.Appendable appendable25 = cSVPrinter24.getOut();
        cSVFormat10.print((java.lang.Object) "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true", appendable25, true);
        org.apache.commons.csv.CSVPrinter cSVPrinter28 = new org.apache.commons.csv.CSVPrinter(appendable9, cSVFormat10);
        java.sql.ResultSet resultSet29 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter28.printRecords(resultSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(appendable9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVPrinter24);
        org.junit.Assert.assertNotNull(appendable25);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote(' ');
        java.lang.String str7 = cSVFormat4.toString();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true", cSVFormat4);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withRecordSeparator("Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<\r\n>  SkipHeaderRecord:true ,10,100, Delimiter=<,>  QuoteChar=<\">  RecordSeparator=<  >  SkipHeaderRecord:true ,hi!");
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withHeader(resultSet24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter28 = cSVFormat27.printer();
        cSVPrinter28.printComment("");
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean32 = cSVFormat31.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator(' ');
        java.lang.Object obj37 = null;
        boolean boolean38 = cSVFormat36.equals(obj37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean41 = cSVFormat40.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter48 = cSVFormat45.printer();
        java.lang.Object[] objArray50 = new java.lang.Object[] { "hi!", cSVPrinter48, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat36.withHeaderComments(objArray50);
        cSVPrinter28.printRecord(objArray50);
        java.lang.Appendable appendable53 = cSVPrinter28.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter54 = cSVFormat11.print(appendable53);
        cSVFormat4.println(appendable53);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str7, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVPrinter28);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVPrinter48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(appendable53);
        org.junit.Assert.assertNotNull(cSVPrinter54);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('#');
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = cSVFormat3.parse(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote(' ');
        java.lang.String str8 = cSVFormat5.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean12 = cSVFormat11.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter19 = cSVFormat16.printer();
        cSVPrinter19.close();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean22 = cSVFormat21.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator(' ');
        java.lang.Object obj27 = null;
        boolean boolean28 = cSVFormat26.equals(obj27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean31 = cSVFormat30.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter38 = cSVFormat35.printer();
        java.lang.Object[] objArray40 = new java.lang.Object[] { "hi!", cSVPrinter38, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat26.withHeaderComments(objArray40);
        cSVPrinter19.printRecords(objArray40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat10.withHeaderComments(objArray40);
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean45 = cSVFormat44.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat44.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat44.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat44.withIgnoreEmptyLines(false);
        boolean boolean52 = cSVFormat44.isQuoteCharacterSet();
        java.lang.String[] strArray53 = cSVFormat44.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean55 = cSVFormat54.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat54.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat54.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean67 = cSVFormat66.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat66.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat71.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat75 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean76 = cSVFormat75.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat75.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat78.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat80.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter83 = cSVFormat80.printer();
        java.lang.Appendable appendable84 = cSVPrinter83.getOut();
        cSVFormat73.print((java.lang.Object) 0L, appendable84, false);
        cSVFormat65.println(appendable84);
        cSVFormat43.print((java.lang.Object) strArray53, appendable84, true);
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat43.withIgnoreSurroundingSpaces(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser92 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVPrinter19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVPrinter38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVPrinter83);
        org.junit.Assert.assertNotNull(appendable84);
        org.junit.Assert.assertNotNull(cSVFormat91);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'path' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean8 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean9 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        boolean boolean12 = cSVFormat0.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSet10);
        java.lang.String str12 = cSVFormat9.toString();
        org.apache.commons.csv.CSVFormat.Predefined predefined13 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat14 = predefined13.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.QuoteMode quoteMode17 = cSVFormat16.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat9.withQuoteMode(quoteMode17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str12, "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("'" + predefined13 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined13.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + quoteMode17 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode17.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withNullString("");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        boolean boolean7 = cSVFormat5.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreEmptyLines(true);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withHeader(resultSetMetaData10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat13.printer();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter16.print((java.lang.Object) cSVFormat17);
        java.lang.Appendable appendable19 = cSVPrinter16.getOut();
        java.lang.Appendable appendable20 = cSVPrinter16.getOut();
        org.apache.commons.csv.CSVFormat.Predefined predefined21 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = predefined21.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean24 = cSVFormat23.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter31 = cSVFormat28.printer();
        cSVPrinter31.close();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean34 = cSVFormat33.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withRecordSeparator(' ');
        java.lang.Object obj39 = null;
        boolean boolean40 = cSVFormat38.equals(obj39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean43 = cSVFormat42.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter50 = cSVFormat47.printer();
        java.lang.Object[] objArray52 = new java.lang.Object[] { "hi!", cSVPrinter50, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat38.withHeaderComments(objArray52);
        cSVPrinter31.printRecords(objArray52);
        java.lang.String str55 = cSVFormat22.format(objArray52);
        cSVFormat7.printRecord(appendable20, objArray52);
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean58 = cSVFormat57.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat57.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter65 = cSVFormat62.printer();
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean67 = cSVFormat66.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat66.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat71.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter74 = cSVFormat71.printer();
        org.apache.commons.csv.CSVFormat cSVFormat75 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter74.print((java.lang.Object) cSVFormat75);
        org.apache.commons.csv.CSVFormat cSVFormat79 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean80 = cSVFormat79.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat79.withSkipHeaderRecord(true);
        java.lang.Object[] objArray84 = new java.lang.Object[] { (short) 1, (short) -1, cSVFormat79, 'a' };
        cSVPrinter74.printRecord(objArray84);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat62.withHeaderComments(objArray84);
        org.apache.commons.csv.CSVPrinter cSVPrinter87 = new org.apache.commons.csv.CSVPrinter(appendable20, cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVPrinter16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(appendable19);
        org.junit.Assert.assertNotNull(appendable20);
        org.junit.Assert.assertTrue("'" + predefined21 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined21.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVPrinter31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVPrinter50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVPrinter65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVPrinter74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
        org.junit.Assert.assertNotNull(cSVFormat86);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote(' ');
        java.lang.String str6 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        cSVPrinter17.close();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean20 = cSVFormat19.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator(' ');
        java.lang.Object obj25 = null;
        boolean boolean26 = cSVFormat24.equals(obj25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean29 = cSVFormat28.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter36 = cSVFormat33.printer();
        java.lang.Object[] objArray38 = new java.lang.Object[] { "hi!", cSVPrinter36, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat24.withHeaderComments(objArray38);
        cSVPrinter17.printRecords(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat8.withHeaderComments(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean43 = cSVFormat42.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat42.withIgnoreEmptyLines(false);
        boolean boolean50 = cSVFormat42.isQuoteCharacterSet();
        java.lang.String[] strArray51 = cSVFormat42.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean53 = cSVFormat52.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat52.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean65 = cSVFormat64.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat64.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat73 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean74 = cSVFormat73.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat73.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat78.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter81 = cSVFormat78.printer();
        java.lang.Appendable appendable82 = cSVPrinter81.getOut();
        cSVFormat71.print((java.lang.Object) 0L, appendable82, false);
        cSVFormat63.println(appendable82);
        cSVFormat41.print((java.lang.Object) strArray51, appendable82, true);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat41.withIgnoreSurroundingSpaces(false);
        boolean boolean90 = cSVFormat41.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVPrinter36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVPrinter81);
        org.junit.Assert.assertNotNull(appendable82);
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean6 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat13.printer();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter16.print((java.lang.Object) cSVFormat17);
        java.lang.Appendable appendable19 = cSVPrinter16.getOut();
        java.lang.Appendable appendable20 = cSVPrinter16.getOut();
        org.apache.commons.csv.CSVFormat.Predefined predefined21 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = predefined21.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean24 = cSVFormat23.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter31 = cSVFormat28.printer();
        cSVPrinter31.close();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean34 = cSVFormat33.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withRecordSeparator(' ');
        java.lang.Object obj39 = null;
        boolean boolean40 = cSVFormat38.equals(obj39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean43 = cSVFormat42.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter50 = cSVFormat47.printer();
        java.lang.Object[] objArray52 = new java.lang.Object[] { "hi!", cSVPrinter50, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat38.withHeaderComments(objArray52);
        cSVPrinter31.printRecords(objArray52);
        java.lang.String str55 = cSVFormat22.format(objArray52);
        cSVFormat7.printRecord(appendable20, objArray52);
        org.apache.commons.csv.CSVPrinter cSVPrinter57 = cSVFormat7.printer();
        org.apache.commons.csv.CSVFormat.Predefined predefined58 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat59 = predefined58.getFormat();
        java.lang.Character char60 = cSVFormat59.getCommentMarker();
        cSVPrinter57.print((java.lang.Object) char60);
        cSVPrinter57.close();
        cSVPrinter57.close();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVPrinter16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(appendable19);
        org.junit.Assert.assertNotNull(appendable20);
        org.junit.Assert.assertTrue("'" + predefined21 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined21.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVPrinter31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVPrinter50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVPrinter57);
        org.junit.Assert.assertTrue("'" + predefined58 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined58.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNull(char60);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord(false);
        java.lang.String[] strArray7 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!", "100,-1,100.0" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withHeader(strArray7);
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char6 = cSVFormat3.getEscapeCharacter();
        boolean boolean7 = cSVFormat3.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreHeaderCase();
        java.nio.file.Path path11 = null;
        java.nio.charset.Charset charset12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat3.print(path11, charset12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        boolean boolean7 = cSVFormat5.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat.Predefined predefined8 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat9 = predefined8.getFormat();
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(false);
        java.lang.String[] strArray15 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!", "100,-1,100.0" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat5.withHeader(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + predefined8 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined8.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat13.printer();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter16.print((java.lang.Object) cSVFormat17);
        java.lang.Appendable appendable19 = cSVPrinter16.getOut();
        java.lang.Appendable appendable20 = cSVPrinter16.getOut();
        org.apache.commons.csv.CSVFormat.Predefined predefined21 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = predefined21.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean24 = cSVFormat23.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter31 = cSVFormat28.printer();
        cSVPrinter31.close();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean34 = cSVFormat33.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withRecordSeparator(' ');
        java.lang.Object obj39 = null;
        boolean boolean40 = cSVFormat38.equals(obj39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean43 = cSVFormat42.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter50 = cSVFormat47.printer();
        java.lang.Object[] objArray52 = new java.lang.Object[] { "hi!", cSVPrinter50, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat38.withHeaderComments(objArray52);
        cSVPrinter31.printRecords(objArray52);
        java.lang.String str55 = cSVFormat22.format(objArray52);
        cSVFormat7.printRecord(appendable20, objArray52);
        org.apache.commons.csv.CSVPrinter cSVPrinter57 = cSVFormat7.printer();
        cSVPrinter57.println();
        cSVPrinter57.flush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVPrinter16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(appendable19);
        org.junit.Assert.assertNotNull(appendable20);
        org.junit.Assert.assertTrue("'" + predefined21 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined21.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVPrinter31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVPrinter50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVPrinter57);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAutoFlush(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat5.equals(obj6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", cSVPrinter17, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEscape('4');
        boolean boolean26 = cSVFormat20.equals((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean29 = cSVFormat28.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean38 = cSVFormat37.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter45 = cSVFormat42.printer();
        java.lang.Appendable appendable46 = cSVPrinter45.getOut();
        cSVFormat35.print((java.lang.Object) 0L, appendable46, false);
        org.apache.commons.csv.CSVFormat.Predefined predefined49 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat50 = predefined49.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean52 = cSVFormat51.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat51.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter59 = cSVFormat56.printer();
        cSVPrinter59.close();
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean62 = cSVFormat61.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withRecordSeparator(' ');
        java.lang.Object obj67 = null;
        boolean boolean68 = cSVFormat66.equals(obj67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean71 = cSVFormat70.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat70.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat73.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat75.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter78 = cSVFormat75.printer();
        java.lang.Object[] objArray80 = new java.lang.Object[] { "hi!", cSVPrinter78, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat66.withHeaderComments(objArray80);
        cSVPrinter59.printRecords(objArray80);
        java.lang.String str83 = cSVFormat50.format(objArray80);
        cSVFormat20.printRecord(appendable46, objArray80);
        java.lang.String str85 = cSVFormat20.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVPrinter45);
        org.junit.Assert.assertNotNull(appendable46);
        org.junit.Assert.assertTrue("'" + predefined49 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined49.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVPrinter59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVPrinter78);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + " " + "'", str85, " ");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
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
        boolean boolean18 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat0.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVPrinter14);
        org.junit.Assert.assertNotNull(appendable15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withHeader(resultSet10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        java.lang.String str10 = cSVFormat7.toString();
        boolean boolean11 = cSVFormat7.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str10, "Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(false);
        java.lang.String[] strArray9 = cSVFormat8.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        cSVPrinter12.flush();
        cSVPrinter12.print((java.lang.Object) '4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat21.printer();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter24.print((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean30 = cSVFormat29.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withSkipHeaderRecord(true);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, (short) -1, cSVFormat29, 'a' };
        cSVPrinter24.printRecord(objArray34);
        cSVPrinter12.printRecords(objArray34);
        org.apache.commons.csv.CSVFormat.Predefined predefined37 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat38 = predefined37.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean40 = cSVFormat39.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter47 = cSVFormat44.printer();
        cSVPrinter47.close();
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean50 = cSVFormat49.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withRecordSeparator(' ');
        java.lang.Object obj55 = null;
        boolean boolean56 = cSVFormat54.equals(obj55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean59 = cSVFormat58.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat58.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter66 = cSVFormat63.printer();
        java.lang.Object[] objArray68 = new java.lang.Object[] { "hi!", cSVPrinter66, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat54.withHeaderComments(objArray68);
        cSVPrinter47.printRecords(objArray68);
        java.lang.String str71 = cSVFormat38.format(objArray68);
        cSVPrinter12.printRecord(objArray68);
        cSVPrinter12.flush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVPrinter24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
        org.junit.Assert.assertTrue("'" + predefined37 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined37.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVPrinter47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVPrinter66);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(cSVFormat69);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator(' ');
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat8);
        char char10 = cSVFormat8.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'path' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        java.lang.String[] strArray6 = cSVFormat0.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        cSVPrinter12.flush();
        cSVPrinter12.print((java.lang.Object) '4');
        cSVPrinter12.close();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape(' ');
        boolean boolean10 = cSVFormat9.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        java.lang.String[] strArray8 = cSVFormat7.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withEscape('\"');
        org.apache.commons.csv.CSVFormat.Predefined predefined11 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat12 = predefined11.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat14.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withQuoteMode(quoteMode15);
        java.lang.Class<?> wildcardClass17 = cSVFormat10.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + predefined11 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined11.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + quoteMode15 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode15.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat4.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        java.lang.Appendable appendable9 = cSVPrinter8.getOut();
        cSVPrinter8.flush();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean12 = cSVFormat11.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter19 = cSVFormat16.printer();
        boolean boolean20 = cSVFormat16.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withSkipHeaderRecord(false);
        java.lang.String[] strArray23 = cSVFormat22.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentMarker((java.lang.Character) 'a');
        cSVPrinter8.print((java.lang.Object) cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(appendable9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVPrinter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        java.nio.file.Path path10 = null;
        java.nio.charset.Charset charset11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat9.print(path10, charset11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        boolean boolean9 = cSVFormat5.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withSkipHeaderRecord(false);
        java.lang.Character char12 = cSVFormat11.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        java.lang.Character char3 = cSVFormat2.getEscapeCharacter();
        boolean boolean4 = cSVFormat2.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote(' ');
        java.lang.String str6 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.printer();
        cSVPrinter17.close();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean20 = cSVFormat19.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator(' ');
        java.lang.Object obj25 = null;
        boolean boolean26 = cSVFormat24.equals(obj25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean29 = cSVFormat28.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter36 = cSVFormat33.printer();
        java.lang.Object[] objArray38 = new java.lang.Object[] { "hi!", cSVPrinter36, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat24.withHeaderComments(objArray38);
        cSVPrinter17.printRecords(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat8.withHeaderComments(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean43 = cSVFormat42.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat42.withIgnoreEmptyLines(false);
        boolean boolean50 = cSVFormat42.isQuoteCharacterSet();
        java.lang.String[] strArray51 = cSVFormat42.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean53 = cSVFormat52.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat52.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean65 = cSVFormat64.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat64.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat73 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean74 = cSVFormat73.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat73.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat78.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter81 = cSVFormat78.printer();
        java.lang.Appendable appendable82 = cSVPrinter81.getOut();
        cSVFormat71.print((java.lang.Object) 0L, appendable82, false);
        cSVFormat63.println(appendable82);
        cSVFormat41.print((java.lang.Object) strArray51, appendable82, true);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat41.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVPrinter cSVPrinter90 = cSVFormat41.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVPrinter36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVPrinter81);
        org.junit.Assert.assertNotNull(appendable82);
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertNotNull(cSVPrinter90);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat.Predefined predefined12 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat13 = predefined12.getFormat();
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean18 = cSVFormat17.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter25 = cSVFormat22.printer();
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter25.print((java.lang.Object) cSVFormat26);
        java.lang.Appendable appendable28 = cSVPrinter25.getOut();
        java.lang.Appendable appendable29 = cSVPrinter25.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter30 = cSVFormat16.print(appendable29);
        cSVFormat11.println(appendable29);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + predefined12 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined12.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVPrinter25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(appendable28);
        org.junit.Assert.assertNotNull(appendable29);
        org.junit.Assert.assertNotNull(cSVPrinter30);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(false);
        boolean boolean10 = cSVFormat2.isQuoteCharacterSet();
        java.lang.String[] strArray11 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withTrailingDelimiter(false);
        boolean boolean14 = cSVFormat13.getIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAutoFlush(true);
        boolean boolean15 = cSVFormat10.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withRecordSeparator('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(false);
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeader(resultSet10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean14 = cSVFormat13.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter21 = cSVFormat18.printer();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter21.print((java.lang.Object) cSVFormat22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean25 = cSVFormat24.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char30 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean32 = cSVFormat31.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean40 = cSVFormat39.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withRecordSeparator(' ');
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat34, 10L, (byte) 100, cSVFormat44, "hi!" };
        java.lang.String str47 = cSVFormat27.format(objArray46);
        cSVPrinter21.printRecord(objArray46);
        cSVPrinter12.printRecord(objArray46);
        cSVPrinter12.close();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVPrinter21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(char30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, 10, 100, Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:true, hi!]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!" + "'", str47, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",10,100,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=< > SkipHeaderRecord:true\",hi!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        cSVPrinter12.flush();
        cSVPrinter12.print((java.lang.Object) '4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean17 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat21.printer();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter24.print((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean30 = cSVFormat29.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withSkipHeaderRecord(true);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, (short) -1, cSVFormat29, 'a' };
        cSVPrinter24.printRecord(objArray34);
        cSVPrinter12.printRecords(objArray34);
        java.lang.Appendable appendable37 = cSVPrinter12.getOut();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVPrinter24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, -1, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, a]");
        org.junit.Assert.assertNotNull(appendable37);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter8.print((java.lang.Object) cSVFormat9);
        java.lang.Appendable appendable11 = cSVPrinter8.getOut();
        java.lang.Appendable appendable12 = cSVPrinter8.getOut();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean14 = cSVFormat13.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withIgnoreEmptyLines(false);
        boolean boolean21 = cSVFormat13.isQuoteCharacterSet();
        boolean boolean22 = cSVFormat13.getTrim();
        org.apache.commons.csv.CSVPrinter cSVPrinter23 = new org.apache.commons.csv.CSVPrinter(appendable12, cSVFormat13);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean25 = cSVFormat24.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withAllowMissingColumnNames(false);
        java.lang.String[] strArray32 = cSVFormat31.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withEscape('\"');
        org.apache.commons.csv.CSVFormat.Predefined predefined35 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat36 = predefined35.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.QuoteMode quoteMode39 = cSVFormat38.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat34.withQuoteMode(quoteMode39);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat13.withQuoteMode(quoteMode39);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(appendable11);
        org.junit.Assert.assertNotNull(appendable12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + predefined35 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined35.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + quoteMode39 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode39.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSystemRecordSeparator();
        boolean boolean7 = cSVFormat5.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean20 = cSVFormat19.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter27 = cSVFormat24.printer();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        cSVPrinter27.print((java.lang.Object) cSVFormat28);
        java.lang.Appendable appendable30 = cSVPrinter27.getOut();
        java.lang.Appendable appendable31 = cSVPrinter27.getOut();
        cSVFormat5.print((java.lang.Object) cSVFormat16, appendable31, true);
        boolean boolean34 = cSVFormat5.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat5.withQuote((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVPrinter27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(appendable30);
        org.junit.Assert.assertNotNull(appendable31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
    }
}

