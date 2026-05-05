package org.apache.commons.cli.randoop;

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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            java.io.FileInputStream fileInputStream1 = org.apache.commons.cli.TypeHandler.openFile("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find file: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to parse the URL: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass(' ');
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Class<java.lang.String> strClass0 = org.apache.commons.cli.PatternOptionBuilder.STRING_VALUE;
        org.junit.Assert.assertNotNull(strClass0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Class<java.lang.Number> numberClass0 = org.apache.commons.cli.PatternOptionBuilder.NUMBER_VALUE;
        org.junit.Assert.assertNotNull(numberClass0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Class<?> wildcardClass0 = org.apache.commons.cli.PatternOptionBuilder.CLASS_VALUE;
        org.junit.Assert.assertNotNull(wildcardClass0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.File file2 = org.apache.commons.cli.TypeHandler.createFile("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: For input string: \"\"");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.TypeHandler.createClass("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to parse the URL: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.String str2 = parseException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str2, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Class<java.io.File> fileClass1 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file2 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass1);
        java.lang.Class<?> wildcardClass3 = file2.getClass();
        org.junit.Assert.assertNotNull(fileClass1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Class (java.lang.Float and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            java.io.FileInputStream fileInputStream1 = org.apache.commons.cli.TypeHandler.openFile("org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find file: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Class<java.io.File[]> fileArrayClass0 = org.apache.commons.cli.PatternOptionBuilder.FILES_VALUE;
        org.junit.Assert.assertNotNull(fileArrayClass0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Class<java.io.File> fileClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to handle the class: null");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Class<java.lang.Object> objClass0 = org.apache.commons.cli.PatternOptionBuilder.OBJECT_VALUE;
        org.junit.Assert.assertNotNull(objClass0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Class<java.util.Date> dateClass0 = org.apache.commons.cli.PatternOptionBuilder.DATE_VALUE;
        org.junit.Assert.assertNotNull(dateClass0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to parse the URL: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Class<java.net.URL> uRLClass0 = org.apache.commons.cli.PatternOptionBuilder.URL_VALUE;
        org.junit.Assert.assertNotNull(uRLClass0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass('a');
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass('4');
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Class (java.lang.Character and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: For input string: \"org.apache.commons.cli.ParseException:\"");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '.'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("hi!");
        java.lang.String str2 = parseException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.cli.ParseException: hi!" + "'", str2, "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = parseException1.getSuppressed();
        java.lang.String str4 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str4, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("");
        java.lang.Class<?> wildcardClass2 = options1.getClass();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Class (java.lang.Integer and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.TypeHandler.createClass("org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.String str5 = parseException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str5, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            java.io.FileInputStream fileInputStream1 = org.apache.commons.cli.TypeHandler.openFile("org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find file: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = parseException1.getSuppressed();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseException1.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        java.lang.String str7 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str7, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) parseException5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        boolean boolean1 = org.apache.commons.cli.PatternOptionBuilder.isValueCode(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.TypeHandler.createClass("org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.String str2 = parseException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!" + "'", str2, "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: For input string: \"org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!\"");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to parse the URL: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) parseException2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Class (java.lang.Long and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.TypeHandler.createClass("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.TypeHandler.createClass("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.cli.Options options2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Class<?> wildcardClass6 = parseException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) parseException2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: For input string: \"org.apache.commons.cli.ParseException: hi!\"");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        java.lang.String str14 = parseException8.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str14, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        java.lang.String str14 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str14, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        java.lang.Class<?> wildcardClass10 = parseException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.cli.PatternOptionBuilder patternOptionBuilder0 = new org.apache.commons.cli.PatternOptionBuilder();
        java.lang.Class<?> wildcardClass1 = patternOptionBuilder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        java.lang.String str16 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str16, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            java.io.FileInputStream fileInputStream1 = org.apache.commons.cli.TypeHandler.openFile("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find file: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to parse the URL: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        java.lang.String str9 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!" + "'", str9, "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        java.lang.String str3 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str3, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '.'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object obj1 = org.apache.commons.cli.PatternOptionBuilder.getValueClass('#');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "class java.util.Date");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "class java.util.Date");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "class java.util.Date");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.cli.Options options2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", (java.lang.Object) options2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.Options cannot be cast to class java.lang.Class (org.apache.commons.cli.Options is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        java.lang.String str9 = parseException6.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str9, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.String str5 = parseException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str5, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to parse the URL: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray8 = parseException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = parseException7.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        java.lang.Throwable[] throwableArray11 = parseException7.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) parseException7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        java.lang.Class<?> wildcardClass2 = parseException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: For input string: \"org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!\"");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", (java.lang.Object) "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: ");
        java.lang.String str2 = parseException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: " + "'", str2, "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.Class<?> wildcardClass5 = parseException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Class<java.io.File> fileClass4 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass4);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass4);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", (java.lang.Object) "org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "hi!");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.TypeHandler.createClass("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseException1.addSuppressed(throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray12 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException14);
        java.lang.Throwable[] throwableArray16 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray19 = parseException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = parseException18.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException18);
        parseException1.addSuppressed((java.lang.Throwable) parseException11);
        java.lang.Class<?> wildcardClass23 = parseException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Class (java.lang.Long and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("", fileClass3);
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass3);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass3);
        java.lang.Class<?> wildcardClass7 = file6.getClass();
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "hi!");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Class (java.lang.Double and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        java.lang.Class<?> wildcardClass2 = parseException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray8 = parseException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = parseException7.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        parseException12.addSuppressed((java.lang.Throwable) parseException14);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray18 = parseException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = parseException17.getSuppressed();
        parseException12.addSuppressed((java.lang.Throwable) parseException17);
        parseException2.addSuppressed((java.lang.Throwable) parseException17);
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray24 = parseException23.getSuppressed();
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        parseException23.addSuppressed((java.lang.Throwable) parseException26);
        java.lang.Throwable[] throwableArray28 = parseException23.getSuppressed();
        org.apache.commons.cli.ParseException parseException30 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray31 = parseException30.getSuppressed();
        org.apache.commons.cli.ParseException parseException33 = new org.apache.commons.cli.ParseException("");
        parseException30.addSuppressed((java.lang.Throwable) parseException33);
        parseException23.addSuppressed((java.lang.Throwable) parseException30);
        parseException17.addSuppressed((java.lang.Throwable) parseException30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", (java.lang.Object) parseException30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        parseException8.addSuppressed((java.lang.Throwable) parseException15);
        java.lang.String str21 = parseException8.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str21, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.String str21 = parseException16.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str21, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.cli.TypeHandler typeHandler0 = new org.apache.commons.cli.TypeHandler();
        java.lang.Class<?> wildcardClass1 = typeHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Class<java.io.File> fileClass4 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("", fileClass4);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass4);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass4);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass4);
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        org.junit.Assert.assertNotNull(fileClass4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        parseException8.addSuppressed((java.lang.Throwable) parseException15);
        java.lang.Class<?> wildcardClass21 = parseException8.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '.'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '.'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        // The following exception was thrown during execution in test generation
        try {
            java.io.FileInputStream fileInputStream1 = org.apache.commons.cli.TypeHandler.openFile("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find file: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '.'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("", fileClass3);
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) file5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        java.lang.String str12 = parseException8.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str12, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to parse the URL: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.TypeHandler.createClass("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass3);
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("", fileClass3);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass3);
        java.lang.Class<?> wildcardClass7 = file6.getClass();
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Class<?> wildcardClass6 = parseException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        // The following exception was thrown during execution in test generation
        try {
            java.io.FileInputStream fileInputStream1 = org.apache.commons.cli.TypeHandler.openFile("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find file: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.cli.Options options2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.Throwable[] throwableArray5 = parseException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = parseException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("org.apache.commons.cli.ParseException: ");
        java.lang.Class<?> wildcardClass2 = file1.getClass();
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("hi!");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.Class<java.io.File> fileClass4 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("", fileClass4);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass4);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) file7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        parseException6.addSuppressed((java.lang.Throwable) parseException10);
        java.lang.String str20 = parseException6.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str20, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException9.addSuppressed((java.lang.Throwable) parseException12);
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException16.addSuppressed((java.lang.Throwable) parseException19);
        parseException9.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.Throwable[] throwableArray22 = parseException9.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) throwableArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Throwable; cannot be cast to class java.lang.Class ([Ljava.lang.Throwable; and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Class<java.io.File> fileClass4 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass4);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("", fileClass4);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass4);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass4);
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        org.junit.Assert.assertNotNull(fileClass4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "hi!");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.Class<?> wildcardClass21 = parseException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        java.lang.String str12 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str12, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        java.lang.String str10 = parseException6.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str10, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.Throwable[] throwableArray5 = parseException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = parseException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: For input string: \"org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException:\"");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Class<?> wildcardClass2 = parseException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Class<java.io.File> fileClass4 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass4);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass4);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("", fileClass4);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass4);
        org.junit.Assert.assertNotNull(fileClass4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "hi!");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        // The following exception was thrown during execution in test generation
        try {
            java.io.FileInputStream fileInputStream1 = org.apache.commons.cli.TypeHandler.openFile("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find file: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = parseException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException20.addSuppressed((java.lang.Throwable) parseException22);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException20.addSuppressed((java.lang.Throwable) parseException25);
        parseException10.addSuppressed((java.lang.Throwable) parseException25);
        parseException1.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Class<?> wildcardClass31 = parseException25.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.Class<java.io.File> fileClass1 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass1);
        org.junit.Assert.assertNotNull(fileClass1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass3);
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) fileClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        parseException6.addSuppressed((java.lang.Throwable) parseException10);
        java.lang.Throwable[] throwableArray20 = parseException6.getSuppressed();
        java.lang.String str21 = parseException6.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str21, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Class<java.io.File> fileClass2 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass2);
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass2);
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        org.junit.Assert.assertNotNull(fileClass2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        java.lang.Throwable[] throwableArray20 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = parseException22.getSuppressed();
        parseException15.addSuppressed((java.lang.Throwable) parseException22);
        parseException1.addSuppressed((java.lang.Throwable) parseException15);
        java.lang.Class<?> wildcardClass27 = parseException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray18 = parseException17.getSuppressed();
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        parseException17.addSuppressed((java.lang.Throwable) parseException20);
        java.lang.Throwable[] throwableArray22 = parseException17.getSuppressed();
        org.apache.commons.cli.ParseException parseException24 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray25 = parseException24.getSuppressed();
        org.apache.commons.cli.ParseException parseException27 = new org.apache.commons.cli.ParseException("");
        parseException24.addSuppressed((java.lang.Throwable) parseException27);
        parseException17.addSuppressed((java.lang.Throwable) parseException24);
        org.apache.commons.cli.ParseException parseException31 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray32 = parseException31.getSuppressed();
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException31.addSuppressed((java.lang.Throwable) parseException34);
        java.lang.Throwable[] throwableArray36 = parseException31.getSuppressed();
        org.apache.commons.cli.ParseException parseException38 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray39 = parseException38.getSuppressed();
        java.lang.Throwable[] throwableArray40 = parseException38.getSuppressed();
        parseException31.addSuppressed((java.lang.Throwable) parseException38);
        parseException17.addSuppressed((java.lang.Throwable) parseException31);
        parseException1.addSuppressed((java.lang.Throwable) parseException17);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray8 = parseException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = parseException7.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        parseException12.addSuppressed((java.lang.Throwable) parseException14);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray18 = parseException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = parseException17.getSuppressed();
        parseException12.addSuppressed((java.lang.Throwable) parseException17);
        parseException2.addSuppressed((java.lang.Throwable) parseException17);
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray24 = parseException23.getSuppressed();
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        parseException23.addSuppressed((java.lang.Throwable) parseException26);
        java.lang.Throwable[] throwableArray28 = parseException23.getSuppressed();
        org.apache.commons.cli.ParseException parseException30 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray31 = parseException30.getSuppressed();
        org.apache.commons.cli.ParseException parseException33 = new org.apache.commons.cli.ParseException("");
        parseException30.addSuppressed((java.lang.Throwable) parseException33);
        parseException23.addSuppressed((java.lang.Throwable) parseException30);
        parseException17.addSuppressed((java.lang.Throwable) parseException30);
        org.apache.commons.cli.ParseException parseException38 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException40 = new org.apache.commons.cli.ParseException("");
        parseException38.addSuppressed((java.lang.Throwable) parseException40);
        parseException30.addSuppressed((java.lang.Throwable) parseException38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass3);
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) fileClass3);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass3);
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.io.File file2 = org.apache.commons.cli.TypeHandler.createFile("org.apache.commons.cli.ParseException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) file2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: For input string: \"hi!\"");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray5 = parseException4.getSuppressed();
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        parseException4.addSuppressed((java.lang.Throwable) parseException7);
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException21 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        parseException21.addSuppressed((java.lang.Throwable) parseException23);
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray27 = parseException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = parseException26.getSuppressed();
        parseException21.addSuppressed((java.lang.Throwable) parseException26);
        parseException11.addSuppressed((java.lang.Throwable) parseException26);
        parseException2.addSuppressed((java.lang.Throwable) parseException26);
        java.lang.Throwable[] throwableArray32 = parseException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray30 = parseException29.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        parseException29.addSuppressed((java.lang.Throwable) parseException32);
        parseException22.addSuppressed((java.lang.Throwable) parseException29);
        parseException16.addSuppressed((java.lang.Throwable) parseException29);
        java.lang.String str36 = parseException29.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str36, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        parseException6.addSuppressed((java.lang.Throwable) parseException10);
        java.lang.Class<?> wildcardClass20 = parseException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.cli.Options options2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) options2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.Options cannot be cast to class java.lang.Class (org.apache.commons.cli.Options is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = parseException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray12 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException14);
        java.lang.Throwable[] throwableArray16 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray19 = parseException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = parseException18.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException18);
        parseException1.addSuppressed((java.lang.Throwable) parseException11);
        org.apache.commons.cli.ParseException parseException24 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray25 = parseException24.getSuppressed();
        org.apache.commons.cli.ParseException parseException27 = new org.apache.commons.cli.ParseException("");
        parseException24.addSuppressed((java.lang.Throwable) parseException27);
        java.lang.Throwable[] throwableArray29 = parseException24.getSuppressed();
        org.apache.commons.cli.ParseException parseException31 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray32 = parseException31.getSuppressed();
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException31.addSuppressed((java.lang.Throwable) parseException34);
        parseException24.addSuppressed((java.lang.Throwable) parseException31);
        org.apache.commons.cli.ParseException parseException38 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray39 = parseException38.getSuppressed();
        org.apache.commons.cli.ParseException parseException41 = new org.apache.commons.cli.ParseException("");
        parseException38.addSuppressed((java.lang.Throwable) parseException41);
        java.lang.Throwable[] throwableArray43 = parseException38.getSuppressed();
        org.apache.commons.cli.ParseException parseException45 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray46 = parseException45.getSuppressed();
        java.lang.Throwable[] throwableArray47 = parseException45.getSuppressed();
        parseException38.addSuppressed((java.lang.Throwable) parseException45);
        parseException24.addSuppressed((java.lang.Throwable) parseException38);
        parseException1.addSuppressed((java.lang.Throwable) parseException24);
        java.lang.Class<?> wildcardClass51 = parseException24.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray8 = parseException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = parseException7.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        parseException12.addSuppressed((java.lang.Throwable) parseException14);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray18 = parseException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = parseException17.getSuppressed();
        parseException12.addSuppressed((java.lang.Throwable) parseException17);
        parseException2.addSuppressed((java.lang.Throwable) parseException17);
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray24 = parseException23.getSuppressed();
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        parseException23.addSuppressed((java.lang.Throwable) parseException26);
        java.lang.Throwable[] throwableArray28 = parseException23.getSuppressed();
        org.apache.commons.cli.ParseException parseException30 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray31 = parseException30.getSuppressed();
        org.apache.commons.cli.ParseException parseException33 = new org.apache.commons.cli.ParseException("");
        parseException30.addSuppressed((java.lang.Throwable) parseException33);
        parseException23.addSuppressed((java.lang.Throwable) parseException30);
        parseException17.addSuppressed((java.lang.Throwable) parseException30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", (java.lang.Object) throwableArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Throwable; cannot be cast to class java.lang.Class ([Ljava.lang.Throwable; and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray30 = parseException29.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        parseException29.addSuppressed((java.lang.Throwable) parseException32);
        parseException22.addSuppressed((java.lang.Throwable) parseException29);
        parseException16.addSuppressed((java.lang.Throwable) parseException29);
        java.lang.String str36 = parseException16.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str36, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray15 = parseException14.getSuppressed();
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        parseException14.addSuppressed((java.lang.Throwable) parseException17);
        java.lang.Throwable[] throwableArray19 = parseException14.getSuppressed();
        org.apache.commons.cli.ParseException parseException21 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray22 = parseException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = parseException21.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException21);
        parseException2.addSuppressed((java.lang.Throwable) parseException14);
        org.apache.commons.cli.ParseException parseException27 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        parseException27.addSuppressed((java.lang.Throwable) parseException29);
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = parseException32.getSuppressed();
        parseException27.addSuppressed((java.lang.Throwable) parseException32);
        org.apache.commons.cli.ParseException parseException37 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray38 = parseException37.getSuppressed();
        org.apache.commons.cli.ParseException parseException40 = new org.apache.commons.cli.ParseException("");
        parseException37.addSuppressed((java.lang.Throwable) parseException40);
        java.lang.Throwable[] throwableArray42 = parseException37.getSuppressed();
        org.apache.commons.cli.ParseException parseException44 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray45 = parseException44.getSuppressed();
        java.lang.Throwable[] throwableArray46 = parseException44.getSuppressed();
        parseException37.addSuppressed((java.lang.Throwable) parseException44);
        parseException27.addSuppressed((java.lang.Throwable) parseException37);
        org.apache.commons.cli.ParseException parseException50 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray51 = parseException50.getSuppressed();
        org.apache.commons.cli.ParseException parseException53 = new org.apache.commons.cli.ParseException("");
        parseException50.addSuppressed((java.lang.Throwable) parseException53);
        java.lang.Throwable[] throwableArray55 = parseException50.getSuppressed();
        org.apache.commons.cli.ParseException parseException57 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray58 = parseException57.getSuppressed();
        org.apache.commons.cli.ParseException parseException60 = new org.apache.commons.cli.ParseException("");
        parseException57.addSuppressed((java.lang.Throwable) parseException60);
        parseException50.addSuppressed((java.lang.Throwable) parseException57);
        org.apache.commons.cli.ParseException parseException64 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray65 = parseException64.getSuppressed();
        org.apache.commons.cli.ParseException parseException67 = new org.apache.commons.cli.ParseException("");
        parseException64.addSuppressed((java.lang.Throwable) parseException67);
        java.lang.Throwable[] throwableArray69 = parseException64.getSuppressed();
        org.apache.commons.cli.ParseException parseException71 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray72 = parseException71.getSuppressed();
        java.lang.Throwable[] throwableArray73 = parseException71.getSuppressed();
        parseException64.addSuppressed((java.lang.Throwable) parseException71);
        parseException50.addSuppressed((java.lang.Throwable) parseException64);
        parseException27.addSuppressed((java.lang.Throwable) parseException50);
        parseException14.addSuppressed((java.lang.Throwable) parseException50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj78 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) parseException50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.Throwable[] throwableArray5 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray13 = parseException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = parseException12.getSuppressed();
        parseException7.addSuppressed((java.lang.Throwable) parseException12);
        parseException3.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("hi!");
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray21 = parseException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException18.addSuppressed((java.lang.Throwable) parseException20);
        parseException7.addSuppressed((java.lang.Throwable) parseException20);
        java.lang.String str25 = parseException20.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str25, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.Class<java.io.File> fileClass1 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file2 = org.apache.commons.cli.TypeHandler.createValue("", fileClass1);
        java.lang.Class<?> wildcardClass3 = file2.getClass();
        org.junit.Assert.assertNotNull(fileClass1);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        java.lang.String str2 = parseException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: " + "'", str2, "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException4.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException4.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException14.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray20 = parseException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException19);
        parseException4.addSuppressed((java.lang.Throwable) parseException19);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException25.addSuppressed((java.lang.Throwable) parseException28);
        java.lang.Throwable[] throwableArray30 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException35 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException35);
        parseException25.addSuppressed((java.lang.Throwable) parseException32);
        parseException19.addSuppressed((java.lang.Throwable) parseException32);
        parseException1.addSuppressed((java.lang.Throwable) parseException32);
        java.lang.String str40 = parseException32.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str40, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Class (java.lang.Character and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        parseException6.addSuppressed((java.lang.Throwable) parseException10);
        java.lang.Throwable[] throwableArray20 = parseException10.getSuppressed();
        java.lang.String str21 = parseException10.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str21, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        // The following exception was thrown during execution in test generation
        try {
            java.io.FileInputStream fileInputStream1 = org.apache.commons.cli.TypeHandler.openFile("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find file: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray8 = parseException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = parseException7.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        java.lang.Throwable[] throwableArray11 = parseException7.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray30 = parseException29.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        parseException29.addSuppressed((java.lang.Throwable) parseException32);
        parseException22.addSuppressed((java.lang.Throwable) parseException29);
        parseException16.addSuppressed((java.lang.Throwable) parseException29);
        java.lang.Class<?> wildcardClass36 = parseException16.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        java.lang.String str2 = parseException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!" + "'", str2, "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '.'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException9);
        parseException4.addSuppressed((java.lang.Throwable) parseException7);
        java.lang.String str12 = parseException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str12, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException20.addSuppressed((java.lang.Throwable) parseException22);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException20.addSuppressed((java.lang.Throwable) parseException25);
        parseException10.addSuppressed((java.lang.Throwable) parseException25);
        parseException1.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray31 = parseException25.getSuppressed();
        java.lang.String str32 = parseException25.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str32, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException6.addSuppressed((java.lang.Throwable) parseException9);
        parseException4.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        parseException13.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray19 = parseException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = parseException18.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException18);
        parseException9.addSuppressed((java.lang.Throwable) parseException13);
        java.lang.Throwable[] throwableArray23 = parseException9.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException9);
        java.lang.String str25 = parseException9.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str25, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = parseException3.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.String str7 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.cli.ParseException: hi!" + "'", str7, "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Class<java.io.File> fileClass2 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createValue("", fileClass2);
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass2);
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        org.junit.Assert.assertNotNull(fileClass2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray12 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException14);
        java.lang.Throwable[] throwableArray16 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray19 = parseException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = parseException18.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException18);
        parseException1.addSuppressed((java.lang.Throwable) parseException11);
        java.lang.Throwable[] throwableArray23 = parseException11.getSuppressed();
        java.lang.String str24 = parseException11.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str24, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.Class<java.io.File> fileClass5 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("", fileClass5);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass5);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass5);
        org.junit.Assert.assertNotNull(fileClass5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException4.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException4.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException14.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray20 = parseException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException19);
        parseException4.addSuppressed((java.lang.Throwable) parseException19);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException25.addSuppressed((java.lang.Throwable) parseException28);
        java.lang.Throwable[] throwableArray30 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException35 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException35);
        parseException25.addSuppressed((java.lang.Throwable) parseException32);
        parseException19.addSuppressed((java.lang.Throwable) parseException32);
        parseException1.addSuppressed((java.lang.Throwable) parseException32);
        java.lang.Class<?> wildcardClass40 = parseException32.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Class<java.io.File> fileClass8 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("", fileClass8);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass8);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass8);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file15 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) file15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass8);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray15 = parseException14.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException14);
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        parseException18.addSuppressed((java.lang.Throwable) parseException20);
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException20);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException25.addSuppressed((java.lang.Throwable) parseException28);
        java.lang.Throwable[] throwableArray30 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException35 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException35);
        parseException25.addSuppressed((java.lang.Throwable) parseException32);
        parseException20.addSuppressed((java.lang.Throwable) parseException32);
        java.lang.Throwable[] throwableArray39 = parseException32.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray15 = parseException14.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException14);
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        parseException18.addSuppressed((java.lang.Throwable) parseException20);
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException20);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException25.addSuppressed((java.lang.Throwable) parseException28);
        java.lang.Throwable[] throwableArray30 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException35 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException35);
        parseException25.addSuppressed((java.lang.Throwable) parseException32);
        parseException20.addSuppressed((java.lang.Throwable) parseException32);
        java.lang.Throwable[] throwableArray39 = parseException32.getSuppressed();
        java.lang.Class<?> wildcardClass40 = throwableArray39.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) throwableArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Throwable; cannot be cast to class java.lang.Class ([Ljava.lang.Throwable; and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray12 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException14);
        java.lang.Throwable[] throwableArray16 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray19 = parseException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = parseException18.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException18);
        parseException1.addSuppressed((java.lang.Throwable) parseException11);
        java.lang.String str23 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str23, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to parse the URL: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.Class<java.io.File> fileClass5 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("", fileClass5);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass5);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        org.junit.Assert.assertNotNull(fileClass5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException20.addSuppressed((java.lang.Throwable) parseException22);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException20.addSuppressed((java.lang.Throwable) parseException25);
        parseException10.addSuppressed((java.lang.Throwable) parseException25);
        parseException1.addSuppressed((java.lang.Throwable) parseException25);
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException35 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException35);
        java.lang.Throwable[] throwableArray37 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException39 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray40 = parseException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = parseException39.getSuppressed();
        parseException32.addSuppressed((java.lang.Throwable) parseException39);
        org.apache.commons.cli.ParseException parseException44 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray45 = parseException44.getSuppressed();
        parseException32.addSuppressed((java.lang.Throwable) parseException44);
        parseException25.addSuppressed((java.lang.Throwable) parseException32);
        java.lang.String str48 = parseException25.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str48, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.Class<java.io.File> fileClass7 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("", fileClass7);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass7);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) file13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", obj1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to handle the class: null");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        parseException6.addSuppressed((java.lang.Throwable) parseException10);
        java.lang.String str20 = parseException10.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str20, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.TypeHandler.createClass("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray5 = parseException4.getSuppressed();
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        parseException4.addSuppressed((java.lang.Throwable) parseException7);
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException21 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        parseException21.addSuppressed((java.lang.Throwable) parseException23);
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray27 = parseException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = parseException26.getSuppressed();
        parseException21.addSuppressed((java.lang.Throwable) parseException26);
        parseException11.addSuppressed((java.lang.Throwable) parseException26);
        parseException2.addSuppressed((java.lang.Throwable) parseException26);
        org.apache.commons.cli.ParseException parseException33 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray34 = parseException33.getSuppressed();
        org.apache.commons.cli.ParseException parseException36 = new org.apache.commons.cli.ParseException("");
        parseException33.addSuppressed((java.lang.Throwable) parseException36);
        java.lang.Throwable[] throwableArray38 = parseException33.getSuppressed();
        org.apache.commons.cli.ParseException parseException40 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray41 = parseException40.getSuppressed();
        java.lang.Throwable[] throwableArray42 = parseException40.getSuppressed();
        parseException33.addSuppressed((java.lang.Throwable) parseException40);
        org.apache.commons.cli.ParseException parseException45 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray46 = parseException45.getSuppressed();
        parseException33.addSuppressed((java.lang.Throwable) parseException45);
        parseException26.addSuppressed((java.lang.Throwable) parseException33);
        java.lang.Class<?> wildcardClass49 = parseException26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) parseException26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException4.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException4.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException14.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray20 = parseException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException19);
        parseException4.addSuppressed((java.lang.Throwable) parseException19);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException25.addSuppressed((java.lang.Throwable) parseException28);
        java.lang.Throwable[] throwableArray30 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException35 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException35);
        parseException25.addSuppressed((java.lang.Throwable) parseException32);
        parseException19.addSuppressed((java.lang.Throwable) parseException32);
        parseException1.addSuppressed((java.lang.Throwable) parseException32);
        java.lang.Class<?> wildcardClass40 = parseException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: For input string: \"org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException:\"");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        parseException8.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray30 = parseException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = parseException29.getSuppressed();
        parseException22.addSuppressed((java.lang.Throwable) parseException29);
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray35 = parseException34.getSuppressed();
        org.apache.commons.cli.ParseException parseException37 = new org.apache.commons.cli.ParseException("");
        parseException34.addSuppressed((java.lang.Throwable) parseException37);
        java.lang.Throwable[] throwableArray39 = parseException34.getSuppressed();
        org.apache.commons.cli.ParseException parseException41 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray42 = parseException41.getSuppressed();
        java.lang.Throwable[] throwableArray43 = parseException41.getSuppressed();
        parseException34.addSuppressed((java.lang.Throwable) parseException41);
        parseException22.addSuppressed((java.lang.Throwable) parseException34);
        parseException8.addSuppressed((java.lang.Throwable) parseException34);
        java.lang.String str47 = parseException34.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str47, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException9.addSuppressed((java.lang.Throwable) parseException12);
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        java.lang.Throwable[] throwableArray15 = parseException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", (java.lang.Object) parseException2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException13.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.Throwable[] throwableArray18 = parseException13.getSuppressed();
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray21 = parseException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException20);
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        java.lang.Class<?> wildcardClass25 = parseException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException20.addSuppressed((java.lang.Throwable) parseException22);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException20.addSuppressed((java.lang.Throwable) parseException25);
        parseException10.addSuppressed((java.lang.Throwable) parseException25);
        parseException1.addSuppressed((java.lang.Throwable) parseException25);
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException34);
        parseException25.addSuppressed((java.lang.Throwable) parseException34);
        org.apache.commons.cli.ParseException parseException38 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException40 = new org.apache.commons.cli.ParseException("");
        parseException38.addSuppressed((java.lang.Throwable) parseException40);
        org.apache.commons.cli.ParseException parseException43 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray44 = parseException43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = parseException43.getSuppressed();
        parseException38.addSuppressed((java.lang.Throwable) parseException43);
        org.apache.commons.cli.ParseException parseException48 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException50 = new org.apache.commons.cli.ParseException("");
        parseException48.addSuppressed((java.lang.Throwable) parseException50);
        org.apache.commons.cli.ParseException parseException53 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray54 = parseException53.getSuppressed();
        java.lang.Throwable[] throwableArray55 = parseException53.getSuppressed();
        parseException48.addSuppressed((java.lang.Throwable) parseException53);
        parseException38.addSuppressed((java.lang.Throwable) parseException53);
        org.apache.commons.cli.ParseException parseException59 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray60 = parseException59.getSuppressed();
        org.apache.commons.cli.ParseException parseException62 = new org.apache.commons.cli.ParseException("");
        parseException59.addSuppressed((java.lang.Throwable) parseException62);
        java.lang.Throwable[] throwableArray64 = parseException59.getSuppressed();
        org.apache.commons.cli.ParseException parseException66 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray67 = parseException66.getSuppressed();
        org.apache.commons.cli.ParseException parseException69 = new org.apache.commons.cli.ParseException("");
        parseException66.addSuppressed((java.lang.Throwable) parseException69);
        parseException59.addSuppressed((java.lang.Throwable) parseException66);
        parseException53.addSuppressed((java.lang.Throwable) parseException66);
        java.lang.Throwable[] throwableArray73 = parseException66.getSuppressed();
        parseException34.addSuppressed((java.lang.Throwable) parseException66);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray73);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.Class<java.io.File> fileClass7 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("", fileClass7);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass7);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("", fileClass7);
        org.junit.Assert.assertNotNull(fileClass7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException17.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException19);
        org.apache.commons.cli.ParseException parseException24 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray25 = parseException24.getSuppressed();
        org.apache.commons.cli.ParseException parseException27 = new org.apache.commons.cli.ParseException("");
        parseException24.addSuppressed((java.lang.Throwable) parseException27);
        java.lang.Throwable[] throwableArray29 = parseException24.getSuppressed();
        org.apache.commons.cli.ParseException parseException31 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray32 = parseException31.getSuppressed();
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException31.addSuppressed((java.lang.Throwable) parseException34);
        parseException24.addSuppressed((java.lang.Throwable) parseException31);
        parseException19.addSuppressed((java.lang.Throwable) parseException31);
        java.lang.Throwable[] throwableArray38 = parseException31.getSuppressed();
        java.lang.Class<?> wildcardClass39 = parseException31.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.Class<java.io.File> fileClass8 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("", fileClass8);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass8);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass8);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file15 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) file15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass8);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        parseException8.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        parseException8.addSuppressed((java.lang.Throwable) parseException22);
        java.lang.String str24 = parseException22.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!" + "'", str24, "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        java.lang.Throwable[] throwableArray20 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = parseException22.getSuppressed();
        parseException15.addSuppressed((java.lang.Throwable) parseException22);
        parseException1.addSuppressed((java.lang.Throwable) parseException15);
        java.lang.Throwable[] throwableArray27 = parseException15.getSuppressed();
        java.lang.Class<?> wildcardClass28 = throwableArray27.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException13.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.Throwable[] throwableArray18 = parseException13.getSuppressed();
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray21 = parseException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException20);
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        java.lang.String str25 = parseException13.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str25, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.Class<java.io.File> fileClass7 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("", fileClass7);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass7);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass7);
        org.junit.Assert.assertNotNull(fileClass7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.Class<java.io.File> fileClass8 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("", fileClass8);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass8);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass8);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file15 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) file15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass8);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray15 = parseException14.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException14);
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        parseException18.addSuppressed((java.lang.Throwable) parseException20);
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) parseException20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.Class<java.io.File> fileClass5 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("", fileClass5);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass5);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass5);
        org.junit.Assert.assertNotNull(fileClass5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        java.lang.Class<?> wildcardClass16 = parseException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        parseException6.addSuppressed((java.lang.Throwable) parseException10);
        java.lang.Throwable[] throwableArray20 = parseException10.getSuppressed();
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException27 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray28 = parseException27.getSuppressed();
        org.apache.commons.cli.ParseException parseException30 = new org.apache.commons.cli.ParseException("");
        parseException27.addSuppressed((java.lang.Throwable) parseException30);
        parseException25.addSuppressed((java.lang.Throwable) parseException30);
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException36 = new org.apache.commons.cli.ParseException("");
        parseException34.addSuppressed((java.lang.Throwable) parseException36);
        org.apache.commons.cli.ParseException parseException39 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray40 = parseException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = parseException39.getSuppressed();
        parseException34.addSuppressed((java.lang.Throwable) parseException39);
        parseException30.addSuppressed((java.lang.Throwable) parseException34);
        java.lang.Throwable[] throwableArray44 = parseException30.getSuppressed();
        parseException22.addSuppressed((java.lang.Throwable) parseException30);
        parseException10.addSuppressed((java.lang.Throwable) parseException30);
        java.lang.Throwable[] throwableArray47 = parseException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray47);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException6.addSuppressed((java.lang.Throwable) parseException9);
        parseException4.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        parseException13.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray19 = parseException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = parseException18.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException18);
        parseException9.addSuppressed((java.lang.Throwable) parseException13);
        java.lang.Throwable[] throwableArray23 = parseException9.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException9);
        java.lang.String str25 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!" + "'", str25, "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException9.addSuppressed((java.lang.Throwable) parseException12);
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException16.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray21 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray24 = parseException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = parseException23.getSuppressed();
        parseException16.addSuppressed((java.lang.Throwable) parseException23);
        parseException2.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.Throwable[] throwableArray28 = parseException16.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) throwableArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Throwable; cannot be cast to class java.lang.Class ([Ljava.lang.Throwable; and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        java.lang.Class<?> wildcardClass2 = parseException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException20.addSuppressed((java.lang.Throwable) parseException22);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException20.addSuppressed((java.lang.Throwable) parseException25);
        parseException10.addSuppressed((java.lang.Throwable) parseException25);
        parseException1.addSuppressed((java.lang.Throwable) parseException25);
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException34);
        parseException25.addSuppressed((java.lang.Throwable) parseException34);
        java.lang.String str37 = parseException34.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str37, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        java.lang.Throwable[] throwableArray13 = parseException9.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        java.lang.String str3 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!" + "'", str3, "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException20.addSuppressed((java.lang.Throwable) parseException22);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException20.addSuppressed((java.lang.Throwable) parseException25);
        parseException10.addSuppressed((java.lang.Throwable) parseException25);
        parseException1.addSuppressed((java.lang.Throwable) parseException25);
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException34);
        parseException25.addSuppressed((java.lang.Throwable) parseException34);
        java.lang.Throwable[] throwableArray37 = parseException34.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray8 = parseException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = parseException7.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray13 = parseException12.getSuppressed();
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        parseException12.addSuppressed((java.lang.Throwable) parseException15);
        java.lang.Throwable[] throwableArray17 = parseException12.getSuppressed();
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray20 = parseException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException12.addSuppressed((java.lang.Throwable) parseException19);
        parseException2.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray28 = parseException25.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException17.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Class<?> wildcardClass23 = parseException19.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException9);
        parseException4.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        parseException13.addSuppressed((java.lang.Throwable) parseException18);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException24 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException24);
        org.apache.commons.cli.ParseException parseException27 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray28 = parseException27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = parseException27.getSuppressed();
        parseException22.addSuppressed((java.lang.Throwable) parseException27);
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException34);
        org.apache.commons.cli.ParseException parseException37 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray38 = parseException37.getSuppressed();
        java.lang.Throwable[] throwableArray39 = parseException37.getSuppressed();
        parseException32.addSuppressed((java.lang.Throwable) parseException37);
        parseException22.addSuppressed((java.lang.Throwable) parseException37);
        parseException13.addSuppressed((java.lang.Throwable) parseException37);
        org.apache.commons.cli.ParseException parseException44 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray45 = parseException44.getSuppressed();
        org.apache.commons.cli.ParseException parseException47 = new org.apache.commons.cli.ParseException("");
        parseException44.addSuppressed((java.lang.Throwable) parseException47);
        java.lang.Throwable[] throwableArray49 = parseException44.getSuppressed();
        org.apache.commons.cli.ParseException parseException51 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray52 = parseException51.getSuppressed();
        java.lang.Throwable[] throwableArray53 = parseException51.getSuppressed();
        parseException44.addSuppressed((java.lang.Throwable) parseException51);
        org.apache.commons.cli.ParseException parseException56 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray57 = parseException56.getSuppressed();
        parseException44.addSuppressed((java.lang.Throwable) parseException56);
        parseException37.addSuppressed((java.lang.Throwable) parseException44);
        parseException7.addSuppressed((java.lang.Throwable) parseException37);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        java.lang.Throwable[] throwableArray12 = parseException8.getSuppressed();
        java.lang.Class<?> wildcardClass13 = throwableArray12.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException13.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.Throwable[] throwableArray18 = parseException13.getSuppressed();
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray21 = parseException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException20);
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        java.lang.Throwable[] throwableArray25 = parseException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.lang.Class<java.io.File> fileClass4 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass4);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass4);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass4);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass4);
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        org.junit.Assert.assertNotNull(fileClass4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "hi!");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException4.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException10);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = parseException13.getSuppressed();
        parseException8.addSuppressed((java.lang.Throwable) parseException13);
        parseException4.addSuppressed((java.lang.Throwable) parseException8);
        java.lang.Class<?> wildcardClass18 = parseException8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to handle the class: class org.apache.commons.cli.ParseException");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.Class<java.io.File> fileClass4 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("", fileClass4);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass4);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass4);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass4);
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        org.junit.Assert.assertNotNull(fileClass4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass3);
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass3);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass3);
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass3);
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass3);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass3);
        java.lang.Class<?> wildcardClass7 = file6.getClass();
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass3);
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", (java.lang.Object) "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray30 = parseException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = parseException29.getSuppressed();
        parseException22.addSuppressed((java.lang.Throwable) parseException29);
        parseException1.addSuppressed((java.lang.Throwable) parseException29);
        java.lang.Throwable[] throwableArray34 = parseException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray34);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException17.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray23 = parseException19.getSuppressed();
        java.lang.String str24 = parseException19.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str24, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray8 = parseException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = parseException7.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        parseException12.addSuppressed((java.lang.Throwable) parseException14);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray18 = parseException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = parseException17.getSuppressed();
        parseException12.addSuppressed((java.lang.Throwable) parseException17);
        parseException2.addSuppressed((java.lang.Throwable) parseException17);
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray24 = parseException23.getSuppressed();
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        parseException23.addSuppressed((java.lang.Throwable) parseException26);
        java.lang.Throwable[] throwableArray28 = parseException23.getSuppressed();
        org.apache.commons.cli.ParseException parseException30 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray31 = parseException30.getSuppressed();
        org.apache.commons.cli.ParseException parseException33 = new org.apache.commons.cli.ParseException("");
        parseException30.addSuppressed((java.lang.Throwable) parseException33);
        parseException23.addSuppressed((java.lang.Throwable) parseException30);
        parseException17.addSuppressed((java.lang.Throwable) parseException30);
        java.lang.Class<?> wildcardClass37 = parseException30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", (java.lang.Object) wildcardClass37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to handle the class: class org.apache.commons.cli.ParseException");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        java.lang.String str2 = parseException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: " + "'", str2, "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.TypeHandler.createClass("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        java.lang.Throwable[] throwableArray20 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = parseException22.getSuppressed();
        parseException15.addSuppressed((java.lang.Throwable) parseException22);
        parseException1.addSuppressed((java.lang.Throwable) parseException15);
        java.lang.Throwable[] throwableArray27 = parseException1.getSuppressed();
        java.lang.Throwable[] throwableArray28 = parseException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass3);
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass3);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass3);
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException9.addSuppressed((java.lang.Throwable) parseException12);
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException16.addSuppressed((java.lang.Throwable) parseException19);
        parseException9.addSuppressed((java.lang.Throwable) parseException16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", (java.lang.Object) parseException9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to parse the URL: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException17.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException19);
        org.apache.commons.cli.ParseException parseException24 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray25 = parseException24.getSuppressed();
        org.apache.commons.cli.ParseException parseException27 = new org.apache.commons.cli.ParseException("");
        parseException24.addSuppressed((java.lang.Throwable) parseException27);
        java.lang.Throwable[] throwableArray29 = parseException24.getSuppressed();
        org.apache.commons.cli.ParseException parseException31 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray32 = parseException31.getSuppressed();
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException31.addSuppressed((java.lang.Throwable) parseException34);
        parseException24.addSuppressed((java.lang.Throwable) parseException31);
        parseException19.addSuppressed((java.lang.Throwable) parseException31);
        org.apache.commons.cli.ParseException parseException39 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException41 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray42 = parseException41.getSuppressed();
        org.apache.commons.cli.ParseException parseException44 = new org.apache.commons.cli.ParseException("");
        parseException41.addSuppressed((java.lang.Throwable) parseException44);
        parseException39.addSuppressed((java.lang.Throwable) parseException44);
        org.apache.commons.cli.ParseException parseException48 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException50 = new org.apache.commons.cli.ParseException("");
        parseException48.addSuppressed((java.lang.Throwable) parseException50);
        org.apache.commons.cli.ParseException parseException53 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray54 = parseException53.getSuppressed();
        java.lang.Throwable[] throwableArray55 = parseException53.getSuppressed();
        parseException48.addSuppressed((java.lang.Throwable) parseException53);
        parseException44.addSuppressed((java.lang.Throwable) parseException48);
        parseException19.addSuppressed((java.lang.Throwable) parseException48);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        parseException8.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        parseException8.addSuppressed((java.lang.Throwable) parseException22);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException27 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray28 = parseException27.getSuppressed();
        org.apache.commons.cli.ParseException parseException30 = new org.apache.commons.cli.ParseException("");
        parseException27.addSuppressed((java.lang.Throwable) parseException30);
        parseException25.addSuppressed((java.lang.Throwable) parseException30);
        parseException22.addSuppressed((java.lang.Throwable) parseException30);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        java.lang.Throwable[] throwableArray10 = parseException1.getSuppressed();
        java.lang.Class<?> wildcardClass11 = throwableArray10.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.Throwable[] throwableArray5 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray13 = parseException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = parseException12.getSuppressed();
        parseException7.addSuppressed((java.lang.Throwable) parseException12);
        parseException3.addSuppressed((java.lang.Throwable) parseException7);
        java.lang.Throwable[] throwableArray17 = parseException3.getSuppressed();
        java.lang.String str18 = parseException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str18, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        java.lang.Throwable[] throwableArray20 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = parseException22.getSuppressed();
        parseException15.addSuppressed((java.lang.Throwable) parseException22);
        parseException1.addSuppressed((java.lang.Throwable) parseException15);
        java.lang.Throwable[] throwableArray27 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray28 = parseException15.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException18);
        java.lang.Throwable[] throwableArray20 = parseException15.getSuppressed();
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = parseException22.getSuppressed();
        parseException15.addSuppressed((java.lang.Throwable) parseException22);
        parseException1.addSuppressed((java.lang.Throwable) parseException15);
        java.lang.Throwable[] throwableArray27 = parseException1.getSuppressed();
        java.lang.Class<?> wildcardClass28 = throwableArray27.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass3);
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass3);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass3);
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.lang.Class<java.io.File> fileClass7 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("", fileClass7);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass7);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass7);
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        org.junit.Assert.assertNotNull(fileClass7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException13.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.Throwable[] throwableArray18 = parseException13.getSuppressed();
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray21 = parseException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException20);
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException26.addSuppressed((java.lang.Throwable) parseException28);
        org.apache.commons.cli.ParseException parseException31 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray32 = parseException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = parseException31.getSuppressed();
        parseException26.addSuppressed((java.lang.Throwable) parseException31);
        org.apache.commons.cli.ParseException parseException36 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray37 = parseException36.getSuppressed();
        org.apache.commons.cli.ParseException parseException39 = new org.apache.commons.cli.ParseException("");
        parseException36.addSuppressed((java.lang.Throwable) parseException39);
        java.lang.Throwable[] throwableArray41 = parseException36.getSuppressed();
        org.apache.commons.cli.ParseException parseException43 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray44 = parseException43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = parseException43.getSuppressed();
        parseException36.addSuppressed((java.lang.Throwable) parseException43);
        parseException26.addSuppressed((java.lang.Throwable) parseException36);
        org.apache.commons.cli.ParseException parseException49 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray50 = parseException49.getSuppressed();
        org.apache.commons.cli.ParseException parseException52 = new org.apache.commons.cli.ParseException("");
        parseException49.addSuppressed((java.lang.Throwable) parseException52);
        java.lang.Throwable[] throwableArray54 = parseException49.getSuppressed();
        org.apache.commons.cli.ParseException parseException56 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray57 = parseException56.getSuppressed();
        org.apache.commons.cli.ParseException parseException59 = new org.apache.commons.cli.ParseException("");
        parseException56.addSuppressed((java.lang.Throwable) parseException59);
        parseException49.addSuppressed((java.lang.Throwable) parseException56);
        org.apache.commons.cli.ParseException parseException63 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray64 = parseException63.getSuppressed();
        org.apache.commons.cli.ParseException parseException66 = new org.apache.commons.cli.ParseException("");
        parseException63.addSuppressed((java.lang.Throwable) parseException66);
        java.lang.Throwable[] throwableArray68 = parseException63.getSuppressed();
        org.apache.commons.cli.ParseException parseException70 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray71 = parseException70.getSuppressed();
        java.lang.Throwable[] throwableArray72 = parseException70.getSuppressed();
        parseException63.addSuppressed((java.lang.Throwable) parseException70);
        parseException49.addSuppressed((java.lang.Throwable) parseException63);
        parseException26.addSuppressed((java.lang.Throwable) parseException49);
        parseException13.addSuppressed((java.lang.Throwable) parseException49);
        org.apache.commons.cli.ParseException parseException78 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray79 = parseException78.getSuppressed();
        org.apache.commons.cli.ParseException parseException81 = new org.apache.commons.cli.ParseException("");
        parseException78.addSuppressed((java.lang.Throwable) parseException81);
        parseException13.addSuppressed((java.lang.Throwable) parseException78);
        java.lang.String str84 = parseException78.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str84, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray12 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException14);
        java.lang.Throwable[] throwableArray16 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray19 = parseException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = parseException18.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException18);
        parseException1.addSuppressed((java.lang.Throwable) parseException11);
        org.apache.commons.cli.ParseException parseException24 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        parseException11.addSuppressed((java.lang.Throwable) parseException24);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        parseException6.addSuppressed((java.lang.Throwable) parseException10);
        java.lang.Throwable[] throwableArray20 = parseException10.getSuppressed();
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException27 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray28 = parseException27.getSuppressed();
        org.apache.commons.cli.ParseException parseException30 = new org.apache.commons.cli.ParseException("");
        parseException27.addSuppressed((java.lang.Throwable) parseException30);
        parseException25.addSuppressed((java.lang.Throwable) parseException30);
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException36 = new org.apache.commons.cli.ParseException("");
        parseException34.addSuppressed((java.lang.Throwable) parseException36);
        org.apache.commons.cli.ParseException parseException39 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray40 = parseException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = parseException39.getSuppressed();
        parseException34.addSuppressed((java.lang.Throwable) parseException39);
        parseException30.addSuppressed((java.lang.Throwable) parseException34);
        java.lang.Throwable[] throwableArray44 = parseException30.getSuppressed();
        parseException22.addSuppressed((java.lang.Throwable) parseException30);
        parseException10.addSuppressed((java.lang.Throwable) parseException30);
        org.apache.commons.cli.ParseException parseException48 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray49 = parseException48.getSuppressed();
        org.apache.commons.cli.ParseException parseException51 = new org.apache.commons.cli.ParseException("");
        parseException48.addSuppressed((java.lang.Throwable) parseException51);
        org.apache.commons.cli.ParseException parseException54 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException56 = new org.apache.commons.cli.ParseException("");
        parseException54.addSuppressed((java.lang.Throwable) parseException56);
        parseException51.addSuppressed((java.lang.Throwable) parseException54);
        parseException30.addSuppressed((java.lang.Throwable) parseException54);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.Throwable[] throwableArray5 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray13 = parseException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = parseException12.getSuppressed();
        parseException7.addSuppressed((java.lang.Throwable) parseException12);
        parseException3.addSuppressed((java.lang.Throwable) parseException7);
        java.lang.Throwable[] throwableArray17 = parseException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.Class<java.io.File> fileClass6 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass6);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("", fileClass6);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass6);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass6);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass6);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass6);
        org.junit.Assert.assertNotNull(fileClass6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException9.addSuppressed((java.lang.Throwable) parseException12);
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException16.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray21 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray24 = parseException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = parseException23.getSuppressed();
        parseException16.addSuppressed((java.lang.Throwable) parseException23);
        parseException2.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.Throwable[] throwableArray28 = parseException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) throwableArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Throwable; cannot be cast to class java.lang.Class ([Ljava.lang.Throwable; and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.io.File file2 = org.apache.commons.cli.TypeHandler.createFile("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) file2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass3);
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass3);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("", fileClass3);
        java.lang.Class<?> wildcardClass7 = file6.getClass();
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        // The following exception was thrown during execution in test generation
        try {
            java.io.FileInputStream fileInputStream1 = org.apache.commons.cli.TypeHandler.openFile("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find file: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException13.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.Throwable[] throwableArray18 = parseException13.getSuppressed();
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray21 = parseException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException20);
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException26.addSuppressed((java.lang.Throwable) parseException28);
        org.apache.commons.cli.ParseException parseException31 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray32 = parseException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = parseException31.getSuppressed();
        parseException26.addSuppressed((java.lang.Throwable) parseException31);
        org.apache.commons.cli.ParseException parseException36 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray37 = parseException36.getSuppressed();
        org.apache.commons.cli.ParseException parseException39 = new org.apache.commons.cli.ParseException("");
        parseException36.addSuppressed((java.lang.Throwable) parseException39);
        java.lang.Throwable[] throwableArray41 = parseException36.getSuppressed();
        org.apache.commons.cli.ParseException parseException43 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray44 = parseException43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = parseException43.getSuppressed();
        parseException36.addSuppressed((java.lang.Throwable) parseException43);
        parseException26.addSuppressed((java.lang.Throwable) parseException36);
        org.apache.commons.cli.ParseException parseException49 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray50 = parseException49.getSuppressed();
        org.apache.commons.cli.ParseException parseException52 = new org.apache.commons.cli.ParseException("");
        parseException49.addSuppressed((java.lang.Throwable) parseException52);
        java.lang.Throwable[] throwableArray54 = parseException49.getSuppressed();
        org.apache.commons.cli.ParseException parseException56 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray57 = parseException56.getSuppressed();
        org.apache.commons.cli.ParseException parseException59 = new org.apache.commons.cli.ParseException("");
        parseException56.addSuppressed((java.lang.Throwable) parseException59);
        parseException49.addSuppressed((java.lang.Throwable) parseException56);
        org.apache.commons.cli.ParseException parseException63 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray64 = parseException63.getSuppressed();
        org.apache.commons.cli.ParseException parseException66 = new org.apache.commons.cli.ParseException("");
        parseException63.addSuppressed((java.lang.Throwable) parseException66);
        java.lang.Throwable[] throwableArray68 = parseException63.getSuppressed();
        org.apache.commons.cli.ParseException parseException70 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray71 = parseException70.getSuppressed();
        java.lang.Throwable[] throwableArray72 = parseException70.getSuppressed();
        parseException63.addSuppressed((java.lang.Throwable) parseException70);
        parseException49.addSuppressed((java.lang.Throwable) parseException63);
        parseException26.addSuppressed((java.lang.Throwable) parseException49);
        parseException13.addSuppressed((java.lang.Throwable) parseException49);
        org.apache.commons.cli.ParseException parseException78 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray79 = parseException78.getSuppressed();
        org.apache.commons.cli.ParseException parseException81 = new org.apache.commons.cli.ParseException("");
        parseException78.addSuppressed((java.lang.Throwable) parseException81);
        parseException13.addSuppressed((java.lang.Throwable) parseException78);
        java.lang.Class<?> wildcardClass84 = parseException78.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray15 = parseException14.getSuppressed();
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        parseException14.addSuppressed((java.lang.Throwable) parseException17);
        java.lang.Throwable[] throwableArray19 = parseException14.getSuppressed();
        org.apache.commons.cli.ParseException parseException21 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray22 = parseException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = parseException21.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException21);
        parseException2.addSuppressed((java.lang.Throwable) parseException14);
        java.lang.Throwable[] throwableArray26 = parseException14.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", (java.lang.Object) parseException14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: For input string: \"org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException:\"");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray15 = parseException14.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException14);
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        parseException18.addSuppressed((java.lang.Throwable) parseException20);
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.lang.Class<java.io.File> fileClass6 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass6);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("", fileClass6);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass6);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass6);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) fileClass6);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass6);
        org.junit.Assert.assertNotNull(fileClass6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Class<?> wildcardClass2 = parseException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.lang.Class<java.io.File> fileClass4 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass4);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("", fileClass4);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass4);
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) fileClass4);
        org.junit.Assert.assertNotNull(fileClass4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "hi!");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException9);
        parseException4.addSuppressed((java.lang.Throwable) parseException7);
        java.lang.Throwable[] throwableArray12 = parseException7.getSuppressed();
        java.lang.Class<?> wildcardClass13 = throwableArray12.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.lang.Class<java.io.File> fileClass6 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("", fileClass6);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass6);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass6);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass6);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass6);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass6);
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        org.junit.Assert.assertNotNull(fileClass6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray8 = parseException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = parseException7.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray13 = parseException12.getSuppressed();
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        parseException12.addSuppressed((java.lang.Throwable) parseException15);
        java.lang.Throwable[] throwableArray17 = parseException12.getSuppressed();
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray20 = parseException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException12.addSuppressed((java.lang.Throwable) parseException19);
        parseException2.addSuppressed((java.lang.Throwable) parseException12);
        java.lang.Throwable[] throwableArray24 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException26.addSuppressed((java.lang.Throwable) parseException28);
        org.apache.commons.cli.ParseException parseException31 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray32 = parseException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = parseException31.getSuppressed();
        parseException26.addSuppressed((java.lang.Throwable) parseException31);
        org.apache.commons.cli.ParseException parseException36 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException38 = new org.apache.commons.cli.ParseException("");
        parseException36.addSuppressed((java.lang.Throwable) parseException38);
        org.apache.commons.cli.ParseException parseException41 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray42 = parseException41.getSuppressed();
        java.lang.Throwable[] throwableArray43 = parseException41.getSuppressed();
        parseException36.addSuppressed((java.lang.Throwable) parseException41);
        parseException26.addSuppressed((java.lang.Throwable) parseException41);
        org.apache.commons.cli.ParseException parseException47 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray48 = parseException47.getSuppressed();
        org.apache.commons.cli.ParseException parseException50 = new org.apache.commons.cli.ParseException("");
        parseException47.addSuppressed((java.lang.Throwable) parseException50);
        java.lang.Throwable[] throwableArray52 = parseException47.getSuppressed();
        org.apache.commons.cli.ParseException parseException54 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray55 = parseException54.getSuppressed();
        org.apache.commons.cli.ParseException parseException57 = new org.apache.commons.cli.ParseException("");
        parseException54.addSuppressed((java.lang.Throwable) parseException57);
        parseException47.addSuppressed((java.lang.Throwable) parseException54);
        parseException41.addSuppressed((java.lang.Throwable) parseException54);
        java.lang.Throwable[] throwableArray61 = parseException54.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) parseException2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.lang.Class<java.io.File> fileClass7 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass7);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass7);
        org.junit.Assert.assertNotNull(fileClass7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.Class<java.io.File> fileClass5 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("", fileClass5);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) "org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.Class<java.io.File> fileClass6 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass6);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass6);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("", fileClass6);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("", fileClass6);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass6);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass6);
        org.junit.Assert.assertNotNull(fileClass6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray30 = parseException29.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        parseException29.addSuppressed((java.lang.Throwable) parseException32);
        parseException22.addSuppressed((java.lang.Throwable) parseException29);
        parseException16.addSuppressed((java.lang.Throwable) parseException29);
        java.lang.Throwable[] throwableArray36 = parseException29.getSuppressed();
        java.lang.Throwable[] throwableArray37 = parseException29.getSuppressed();
        java.lang.Throwable[] throwableArray38 = parseException29.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException9.addSuppressed((java.lang.Throwable) parseException12);
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException16.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray21 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray24 = parseException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = parseException23.getSuppressed();
        parseException16.addSuppressed((java.lang.Throwable) parseException23);
        parseException2.addSuppressed((java.lang.Throwable) parseException16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) parseException2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.lang.Class<java.io.File> fileClass8 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("", fileClass8);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass8);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass8);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass8);
        java.io.File file15 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file16 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass8);
        org.junit.Assert.assertNotNull(fileClass8);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNull("file16.getParent() == null", file16.getParent());
        org.junit.Assert.assertEquals(file16.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal option name '.'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray30 = parseException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = parseException29.getSuppressed();
        parseException22.addSuppressed((java.lang.Throwable) parseException29);
        parseException1.addSuppressed((java.lang.Throwable) parseException29);
        java.lang.Class<?> wildcardClass34 = parseException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.lang.Class<java.io.File> fileClass5 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass5);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("", fileClass5);
        org.junit.Assert.assertNotNull(fileClass5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException17.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray23 = parseException19.getSuppressed();
        java.lang.Throwable[] throwableArray24 = parseException19.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass3);
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) file5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "hi!");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException9.addSuppressed((java.lang.Throwable) parseException12);
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException16.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray21 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray24 = parseException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = parseException23.getSuppressed();
        parseException16.addSuppressed((java.lang.Throwable) parseException23);
        parseException2.addSuppressed((java.lang.Throwable) parseException16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.lang.Class<java.io.File> fileClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to handle the class: null");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException20.addSuppressed((java.lang.Throwable) parseException22);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException20.addSuppressed((java.lang.Throwable) parseException25);
        parseException10.addSuppressed((java.lang.Throwable) parseException25);
        parseException1.addSuppressed((java.lang.Throwable) parseException25);
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException35 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException35);
        java.lang.Throwable[] throwableArray37 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException39 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray40 = parseException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = parseException39.getSuppressed();
        parseException32.addSuppressed((java.lang.Throwable) parseException39);
        org.apache.commons.cli.ParseException parseException44 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray45 = parseException44.getSuppressed();
        parseException32.addSuppressed((java.lang.Throwable) parseException44);
        parseException25.addSuppressed((java.lang.Throwable) parseException32);
        java.lang.Throwable[] throwableArray48 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException50 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray51 = parseException50.getSuppressed();
        org.apache.commons.cli.ParseException parseException53 = new org.apache.commons.cli.ParseException("");
        parseException50.addSuppressed((java.lang.Throwable) parseException53);
        java.lang.Throwable[] throwableArray55 = parseException50.getSuppressed();
        org.apache.commons.cli.ParseException parseException57 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray58 = parseException57.getSuppressed();
        org.apache.commons.cli.ParseException parseException60 = new org.apache.commons.cli.ParseException("");
        parseException57.addSuppressed((java.lang.Throwable) parseException60);
        parseException50.addSuppressed((java.lang.Throwable) parseException57);
        org.apache.commons.cli.ParseException parseException64 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray65 = parseException64.getSuppressed();
        org.apache.commons.cli.ParseException parseException67 = new org.apache.commons.cli.ParseException("");
        parseException64.addSuppressed((java.lang.Throwable) parseException67);
        java.lang.Throwable[] throwableArray69 = parseException64.getSuppressed();
        org.apache.commons.cli.ParseException parseException71 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray72 = parseException71.getSuppressed();
        java.lang.Throwable[] throwableArray73 = parseException71.getSuppressed();
        parseException64.addSuppressed((java.lang.Throwable) parseException71);
        parseException50.addSuppressed((java.lang.Throwable) parseException64);
        java.lang.Throwable[] throwableArray76 = parseException64.getSuppressed();
        parseException25.addSuppressed((java.lang.Throwable) parseException64);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray76);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.lang.Class<java.io.File> fileClass5 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("", fileClass5);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass5);
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) fileClass5);
        org.junit.Assert.assertNotNull(fileClass5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.lang.Class<java.io.File> fileClass6 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("", fileClass6);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass6);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass6);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass6);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", (java.lang.Object) file11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.lang.Class<java.io.File> fileClass2 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass2);
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass2);
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        org.junit.Assert.assertNotNull(fileClass2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass3);
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) fileClass3);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass3);
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.lang.Class<java.io.File> fileClass5 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass5);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("", fileClass5);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("", fileClass5);
        org.junit.Assert.assertNotNull(fileClass5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.Throwable[] throwableArray5 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray13 = parseException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = parseException12.getSuppressed();
        parseException7.addSuppressed((java.lang.Throwable) parseException12);
        parseException3.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray19 = parseException18.getSuppressed();
        org.apache.commons.cli.ParseException parseException21 = new org.apache.commons.cli.ParseException("");
        parseException18.addSuppressed((java.lang.Throwable) parseException21);
        java.lang.Throwable[] throwableArray23 = parseException18.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException18.addSuppressed((java.lang.Throwable) parseException25);
        org.apache.commons.cli.ParseException parseException30 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray31 = parseException30.getSuppressed();
        parseException18.addSuppressed((java.lang.Throwable) parseException30);
        java.lang.Throwable[] throwableArray33 = parseException30.getSuppressed();
        parseException3.addSuppressed((java.lang.Throwable) parseException30);
        java.lang.Class<?> wildcardClass35 = parseException30.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray12 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException14);
        java.lang.Throwable[] throwableArray16 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray19 = parseException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = parseException18.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException18);
        parseException1.addSuppressed((java.lang.Throwable) parseException11);
        org.apache.commons.cli.ParseException parseException24 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray25 = parseException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = parseException24.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException24.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException24);
        java.lang.String str29 = parseException24.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str29, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.lang.Class<java.io.File> fileClass5 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass5);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        org.junit.Assert.assertNotNull(fileClass5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.lang.Class<java.io.File> fileClass5 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("", fileClass5);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass5);
        org.junit.Assert.assertNotNull(fileClass5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray8 = parseException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = parseException7.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        java.lang.Throwable[] throwableArray11 = parseException7.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = parseException8.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray14 = parseException13.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException17.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException13.addSuppressed((java.lang.Throwable) parseException19);
        org.apache.commons.cli.ParseException parseException24 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray25 = parseException24.getSuppressed();
        org.apache.commons.cli.ParseException parseException27 = new org.apache.commons.cli.ParseException("");
        parseException24.addSuppressed((java.lang.Throwable) parseException27);
        java.lang.Throwable[] throwableArray29 = parseException24.getSuppressed();
        org.apache.commons.cli.ParseException parseException31 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray32 = parseException31.getSuppressed();
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException31.addSuppressed((java.lang.Throwable) parseException34);
        parseException24.addSuppressed((java.lang.Throwable) parseException31);
        parseException19.addSuppressed((java.lang.Throwable) parseException31);
        org.apache.commons.cli.ParseException parseException39 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray40 = parseException39.getSuppressed();
        org.apache.commons.cli.ParseException parseException42 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException44 = new org.apache.commons.cli.ParseException("");
        parseException42.addSuppressed((java.lang.Throwable) parseException44);
        org.apache.commons.cli.ParseException parseException47 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray48 = parseException47.getSuppressed();
        java.lang.Throwable[] throwableArray49 = parseException47.getSuppressed();
        parseException42.addSuppressed((java.lang.Throwable) parseException47);
        org.apache.commons.cli.ParseException parseException52 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException54 = new org.apache.commons.cli.ParseException("");
        parseException52.addSuppressed((java.lang.Throwable) parseException54);
        org.apache.commons.cli.ParseException parseException57 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray58 = parseException57.getSuppressed();
        java.lang.Throwable[] throwableArray59 = parseException57.getSuppressed();
        parseException52.addSuppressed((java.lang.Throwable) parseException57);
        parseException42.addSuppressed((java.lang.Throwable) parseException57);
        org.apache.commons.cli.ParseException parseException63 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray64 = parseException63.getSuppressed();
        org.apache.commons.cli.ParseException parseException66 = new org.apache.commons.cli.ParseException("");
        parseException63.addSuppressed((java.lang.Throwable) parseException66);
        java.lang.Throwable[] throwableArray68 = parseException63.getSuppressed();
        org.apache.commons.cli.ParseException parseException70 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray71 = parseException70.getSuppressed();
        org.apache.commons.cli.ParseException parseException73 = new org.apache.commons.cli.ParseException("");
        parseException70.addSuppressed((java.lang.Throwable) parseException73);
        parseException63.addSuppressed((java.lang.Throwable) parseException70);
        parseException57.addSuppressed((java.lang.Throwable) parseException70);
        parseException39.addSuppressed((java.lang.Throwable) parseException70);
        java.lang.Throwable[] throwableArray78 = parseException39.getSuppressed();
        parseException31.addSuppressed((java.lang.Throwable) parseException39);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray78);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.lang.Class<java.io.FileInputStream> fileInputStreamClass1 = org.apache.commons.cli.PatternOptionBuilder.EXISTING_FILE_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) fileInputStreamClass1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find file: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileInputStreamClass1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to handle the class: null");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.Throwable[] throwableArray6 = parseException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.Class<java.io.File> fileClass9 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("", fileClass9);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass9);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass9);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass9);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass9);
        java.io.File file15 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass9);
        java.io.File file16 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass9);
        java.io.File file17 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass9);
        java.io.File file18 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass9);
        org.junit.Assert.assertNotNull(fileClass9);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNull("file16.getParent() == null", file16.getParent());
        org.junit.Assert.assertEquals(file16.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertNull("file17.getParent() == null", file17.getParent());
        org.junit.Assert.assertEquals(file17.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertNull("file18.getParent() == null", file18.getParent());
        org.junit.Assert.assertEquals(file18.toString(), "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.lang.Class<java.io.File> fileClass8 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("", fileClass8);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass8);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass8);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass8);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass8);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) fileClass8);
        java.io.File file16 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass8);
        org.junit.Assert.assertNotNull(fileClass8);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNull("file16.getParent() == null", file16.getParent());
        org.junit.Assert.assertEquals(file16.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray30 = parseException29.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        parseException29.addSuppressed((java.lang.Throwable) parseException32);
        parseException22.addSuppressed((java.lang.Throwable) parseException29);
        parseException16.addSuppressed((java.lang.Throwable) parseException29);
        org.apache.commons.cli.ParseException parseException37 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException39 = new org.apache.commons.cli.ParseException("");
        parseException37.addSuppressed((java.lang.Throwable) parseException39);
        parseException29.addSuppressed((java.lang.Throwable) parseException37);
        java.lang.Class<?> wildcardClass42 = parseException37.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.lang.Class<java.io.File> fileClass4 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("", fileClass4);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass4);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass4);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass4);
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        org.junit.Assert.assertNotNull(fileClass4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.lang.Class<java.io.File> fileClass3 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass3);
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("", fileClass3);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass3);
        org.junit.Assert.assertNotNull(fileClass3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException9.addSuppressed((java.lang.Throwable) parseException12);
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        parseException16.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray21 = parseException16.getSuppressed();
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray24 = parseException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = parseException23.getSuppressed();
        parseException16.addSuppressed((java.lang.Throwable) parseException23);
        parseException2.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.Throwable[] throwableArray28 = parseException16.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", (java.lang.Object) throwableArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Throwable; cannot be cast to class java.lang.Class ([Ljava.lang.Throwable; and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray30 = parseException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = parseException29.getSuppressed();
        parseException22.addSuppressed((java.lang.Throwable) parseException29);
        parseException1.addSuppressed((java.lang.Throwable) parseException29);
        java.lang.String str34 = parseException29.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str34, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        parseException6.addSuppressed((java.lang.Throwable) parseException10);
        java.lang.Throwable[] throwableArray20 = parseException6.getSuppressed();
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException24 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException24);
        java.lang.Throwable[] throwableArray26 = parseException24.getSuppressed();
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException30 = new org.apache.commons.cli.ParseException("");
        parseException28.addSuppressed((java.lang.Throwable) parseException30);
        org.apache.commons.cli.ParseException parseException33 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray34 = parseException33.getSuppressed();
        java.lang.Throwable[] throwableArray35 = parseException33.getSuppressed();
        parseException28.addSuppressed((java.lang.Throwable) parseException33);
        parseException24.addSuppressed((java.lang.Throwable) parseException28);
        java.lang.Throwable[] throwableArray38 = parseException24.getSuppressed();
        parseException6.addSuppressed((java.lang.Throwable) parseException24);
        java.lang.String str40 = parseException24.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str40, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", obj1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to handle the class: null");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.Throwable[] throwableArray5 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray13 = parseException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = parseException12.getSuppressed();
        parseException7.addSuppressed((java.lang.Throwable) parseException12);
        parseException3.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("hi!");
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray21 = parseException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException18.addSuppressed((java.lang.Throwable) parseException20);
        parseException7.addSuppressed((java.lang.Throwable) parseException20);
        java.lang.Throwable[] throwableArray25 = parseException7.getSuppressed();
        java.lang.Throwable[] throwableArray26 = parseException7.getSuppressed();
        java.lang.Throwable throwable27 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseException7.addSuppressed(throwable27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.lang.Class<java.io.File> fileClass5 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("", fileClass5);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass5);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        org.junit.Assert.assertNotNull(fileClass5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.lang.Class<java.io.File> fileClass6 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("", fileClass6);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass6);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass6);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass6);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", (java.lang.Object) file11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileClass6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.lang.Class<java.io.File> fileClass5 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("", fileClass5);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass5);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass5);
        org.junit.Assert.assertNotNull(fileClass5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        parseException2.addSuppressed((java.lang.Throwable) parseException5);
        java.lang.Throwable[] throwableArray7 = parseException2.getSuppressed();
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException2.addSuppressed((java.lang.Throwable) parseException9);
        java.lang.Throwable[] throwableArray13 = parseException9.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) throwableArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.Throwable; cannot be cast to class java.lang.Class ([Ljava.lang.Throwable; and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.lang.Class<java.io.File> fileClass7 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("", fileClass7);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass7);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        org.junit.Assert.assertNotNull(fileClass7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.lang.Class<java.io.File> fileClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to handle the class: null");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException20.addSuppressed((java.lang.Throwable) parseException22);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException20.addSuppressed((java.lang.Throwable) parseException25);
        parseException10.addSuppressed((java.lang.Throwable) parseException25);
        parseException6.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray31 = parseException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException9.addSuppressed((java.lang.Throwable) parseException12);
        parseException7.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        parseException16.addSuppressed((java.lang.Throwable) parseException18);
        org.apache.commons.cli.ParseException parseException21 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray22 = parseException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = parseException21.getSuppressed();
        parseException16.addSuppressed((java.lang.Throwable) parseException21);
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException26.addSuppressed((java.lang.Throwable) parseException28);
        org.apache.commons.cli.ParseException parseException31 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray32 = parseException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = parseException31.getSuppressed();
        parseException26.addSuppressed((java.lang.Throwable) parseException31);
        parseException16.addSuppressed((java.lang.Throwable) parseException31);
        parseException7.addSuppressed((java.lang.Throwable) parseException31);
        parseException1.addSuppressed((java.lang.Throwable) parseException7);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.lang.Class<java.io.File> fileClass2 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass2);
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createValue("", fileClass2);
        org.junit.Assert.assertNotNull(fileClass2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException9);
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException9);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException20.addSuppressed((java.lang.Throwable) parseException22);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException20.addSuppressed((java.lang.Throwable) parseException25);
        parseException10.addSuppressed((java.lang.Throwable) parseException25);
        parseException1.addSuppressed((java.lang.Throwable) parseException25);
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException34);
        parseException25.addSuppressed((java.lang.Throwable) parseException34);
        java.lang.Class<?> wildcardClass37 = parseException25.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.lang.Class<java.io.File> fileClass7 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass7);
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", fileClass7);
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ", fileClass7);
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: ", fileClass7);
        org.junit.Assert.assertNotNull(fileClass7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException4.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException4.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException14.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray20 = parseException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException19);
        parseException4.addSuppressed((java.lang.Throwable) parseException19);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException25.addSuppressed((java.lang.Throwable) parseException28);
        java.lang.Throwable[] throwableArray30 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException35 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException35);
        parseException25.addSuppressed((java.lang.Throwable) parseException32);
        parseException19.addSuppressed((java.lang.Throwable) parseException32);
        parseException1.addSuppressed((java.lang.Throwable) parseException32);
        java.lang.Throwable[] throwableArray40 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException42 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException44 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray45 = parseException44.getSuppressed();
        org.apache.commons.cli.ParseException parseException47 = new org.apache.commons.cli.ParseException("");
        parseException44.addSuppressed((java.lang.Throwable) parseException47);
        parseException42.addSuppressed((java.lang.Throwable) parseException47);
        org.apache.commons.cli.ParseException parseException51 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException53 = new org.apache.commons.cli.ParseException("");
        parseException51.addSuppressed((java.lang.Throwable) parseException53);
        org.apache.commons.cli.ParseException parseException56 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray57 = parseException56.getSuppressed();
        java.lang.Throwable[] throwableArray58 = parseException56.getSuppressed();
        parseException51.addSuppressed((java.lang.Throwable) parseException56);
        parseException47.addSuppressed((java.lang.Throwable) parseException51);
        java.lang.Throwable[] throwableArray61 = parseException51.getSuppressed();
        org.apache.commons.cli.ParseException parseException63 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray64 = parseException63.getSuppressed();
        org.apache.commons.cli.ParseException parseException66 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException68 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray69 = parseException68.getSuppressed();
        org.apache.commons.cli.ParseException parseException71 = new org.apache.commons.cli.ParseException("");
        parseException68.addSuppressed((java.lang.Throwable) parseException71);
        parseException66.addSuppressed((java.lang.Throwable) parseException71);
        org.apache.commons.cli.ParseException parseException75 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException77 = new org.apache.commons.cli.ParseException("");
        parseException75.addSuppressed((java.lang.Throwable) parseException77);
        org.apache.commons.cli.ParseException parseException80 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray81 = parseException80.getSuppressed();
        java.lang.Throwable[] throwableArray82 = parseException80.getSuppressed();
        parseException75.addSuppressed((java.lang.Throwable) parseException80);
        parseException71.addSuppressed((java.lang.Throwable) parseException75);
        java.lang.Throwable[] throwableArray85 = parseException71.getSuppressed();
        parseException63.addSuppressed((java.lang.Throwable) parseException71);
        parseException51.addSuppressed((java.lang.Throwable) parseException71);
        parseException1.addSuppressed((java.lang.Throwable) parseException51);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray85);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        java.lang.Class<?> wildcardClass10 = parseException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException4.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException4.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException14.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray20 = parseException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException19);
        parseException4.addSuppressed((java.lang.Throwable) parseException19);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException25.addSuppressed((java.lang.Throwable) parseException28);
        java.lang.Throwable[] throwableArray30 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException35 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException35);
        parseException25.addSuppressed((java.lang.Throwable) parseException32);
        parseException19.addSuppressed((java.lang.Throwable) parseException32);
        parseException1.addSuppressed((java.lang.Throwable) parseException32);
        org.apache.commons.cli.ParseException parseException41 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray42 = parseException41.getSuppressed();
        org.apache.commons.cli.ParseException parseException44 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException46 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray47 = parseException46.getSuppressed();
        org.apache.commons.cli.ParseException parseException49 = new org.apache.commons.cli.ParseException("");
        parseException46.addSuppressed((java.lang.Throwable) parseException49);
        parseException44.addSuppressed((java.lang.Throwable) parseException49);
        org.apache.commons.cli.ParseException parseException53 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException55 = new org.apache.commons.cli.ParseException("");
        parseException53.addSuppressed((java.lang.Throwable) parseException55);
        org.apache.commons.cli.ParseException parseException58 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray59 = parseException58.getSuppressed();
        java.lang.Throwable[] throwableArray60 = parseException58.getSuppressed();
        parseException53.addSuppressed((java.lang.Throwable) parseException58);
        parseException49.addSuppressed((java.lang.Throwable) parseException53);
        java.lang.Throwable[] throwableArray63 = parseException49.getSuppressed();
        parseException41.addSuppressed((java.lang.Throwable) parseException49);
        parseException1.addSuppressed((java.lang.Throwable) parseException49);
        java.lang.Class<?> wildcardClass66 = parseException49.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.lang.Class<java.io.File> fileClass4 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createValue("hi!", fileClass4);
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createValue("", fileClass4);
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass4);
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", fileClass4);
        org.junit.Assert.assertNotNull(fileClass4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "hi!");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray30 = parseException29.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        parseException29.addSuppressed((java.lang.Throwable) parseException32);
        parseException22.addSuppressed((java.lang.Throwable) parseException29);
        parseException16.addSuppressed((java.lang.Throwable) parseException29);
        org.apache.commons.cli.ParseException parseException37 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException39 = new org.apache.commons.cli.ParseException("");
        parseException37.addSuppressed((java.lang.Throwable) parseException39);
        parseException29.addSuppressed((java.lang.Throwable) parseException37);
        java.lang.String str42 = parseException29.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str42, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException4.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: ");
        parseException4.addSuppressed((java.lang.Throwable) parseException8);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException4.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException4.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException14.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray20 = parseException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException19);
        parseException4.addSuppressed((java.lang.Throwable) parseException19);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException25.addSuppressed((java.lang.Throwable) parseException28);
        java.lang.Throwable[] throwableArray30 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException35 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException35);
        parseException25.addSuppressed((java.lang.Throwable) parseException32);
        parseException19.addSuppressed((java.lang.Throwable) parseException32);
        parseException1.addSuppressed((java.lang.Throwable) parseException32);
        java.lang.Throwable[] throwableArray40 = parseException1.getSuppressed();
        java.lang.Throwable[] throwableArray41 = parseException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        java.lang.Throwable[] throwableArray10 = parseException6.getSuppressed();
        java.lang.String str11 = parseException6.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str11, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.Throwable[] throwableArray5 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray13 = parseException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = parseException12.getSuppressed();
        parseException7.addSuppressed((java.lang.Throwable) parseException12);
        parseException3.addSuppressed((java.lang.Throwable) parseException7);
        java.lang.String str17 = parseException3.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str17, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray6 = parseException5.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        parseException5.addSuppressed((java.lang.Throwable) parseException8);
        java.lang.Throwable[] throwableArray10 = parseException5.getSuppressed();
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray13 = parseException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = parseException12.getSuppressed();
        parseException5.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray18 = parseException17.getSuppressed();
        parseException5.addSuppressed((java.lang.Throwable) parseException17);
        org.apache.commons.cli.ParseException parseException21 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray22 = parseException21.getSuppressed();
        org.apache.commons.cli.ParseException parseException24 = new org.apache.commons.cli.ParseException("");
        parseException21.addSuppressed((java.lang.Throwable) parseException24);
        java.lang.Throwable[] throwableArray26 = parseException21.getSuppressed();
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray29 = parseException28.getSuppressed();
        java.lang.Throwable[] throwableArray30 = parseException28.getSuppressed();
        parseException21.addSuppressed((java.lang.Throwable) parseException28);
        org.apache.commons.cli.ParseException parseException33 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray34 = parseException33.getSuppressed();
        org.apache.commons.cli.ParseException parseException36 = new org.apache.commons.cli.ParseException("");
        parseException33.addSuppressed((java.lang.Throwable) parseException36);
        java.lang.Throwable[] throwableArray38 = parseException33.getSuppressed();
        org.apache.commons.cli.ParseException parseException40 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray41 = parseException40.getSuppressed();
        java.lang.Throwable[] throwableArray42 = parseException40.getSuppressed();
        parseException33.addSuppressed((java.lang.Throwable) parseException40);
        parseException21.addSuppressed((java.lang.Throwable) parseException33);
        parseException17.addSuppressed((java.lang.Throwable) parseException33);
        parseException1.addSuppressed((java.lang.Throwable) parseException17);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        java.lang.String str21 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str21, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException17 = new org.apache.commons.cli.ParseException("");
        parseException15.addSuppressed((java.lang.Throwable) parseException17);
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray21 = parseException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = parseException20.getSuppressed();
        parseException15.addSuppressed((java.lang.Throwable) parseException20);
        parseException8.addSuppressed((java.lang.Throwable) parseException15);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: hi!");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException4.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray10 = parseException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = parseException9.getSuppressed();
        parseException4.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        parseException14.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray20 = parseException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = parseException19.getSuppressed();
        parseException14.addSuppressed((java.lang.Throwable) parseException19);
        parseException4.addSuppressed((java.lang.Throwable) parseException19);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException28 = new org.apache.commons.cli.ParseException("");
        parseException25.addSuppressed((java.lang.Throwable) parseException28);
        java.lang.Throwable[] throwableArray30 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray33 = parseException32.getSuppressed();
        org.apache.commons.cli.ParseException parseException35 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException35);
        parseException25.addSuppressed((java.lang.Throwable) parseException32);
        parseException19.addSuppressed((java.lang.Throwable) parseException32);
        parseException1.addSuppressed((java.lang.Throwable) parseException32);
        java.lang.Throwable[] throwableArray40 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException42 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray43 = parseException42.getSuppressed();
        org.apache.commons.cli.ParseException parseException45 = new org.apache.commons.cli.ParseException("");
        parseException42.addSuppressed((java.lang.Throwable) parseException45);
        java.lang.Throwable[] throwableArray47 = parseException42.getSuppressed();
        org.apache.commons.cli.ParseException parseException49 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray50 = parseException49.getSuppressed();
        org.apache.commons.cli.ParseException parseException52 = new org.apache.commons.cli.ParseException("");
        parseException49.addSuppressed((java.lang.Throwable) parseException52);
        parseException42.addSuppressed((java.lang.Throwable) parseException49);
        org.apache.commons.cli.ParseException parseException56 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray57 = parseException56.getSuppressed();
        org.apache.commons.cli.ParseException parseException59 = new org.apache.commons.cli.ParseException("");
        parseException56.addSuppressed((java.lang.Throwable) parseException59);
        parseException49.addSuppressed((java.lang.Throwable) parseException56);
        parseException1.addSuppressed((java.lang.Throwable) parseException56);
        java.lang.String str63 = parseException56.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str63, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException5 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray6 = parseException5.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        parseException5.addSuppressed((java.lang.Throwable) parseException8);
        java.lang.Throwable[] throwableArray10 = parseException5.getSuppressed();
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray13 = parseException12.getSuppressed();
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        parseException12.addSuppressed((java.lang.Throwable) parseException15);
        parseException5.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray20 = parseException19.getSuppressed();
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException19.addSuppressed((java.lang.Throwable) parseException22);
        java.lang.Throwable[] throwableArray24 = parseException19.getSuppressed();
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray27 = parseException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = parseException26.getSuppressed();
        parseException19.addSuppressed((java.lang.Throwable) parseException26);
        parseException5.addSuppressed((java.lang.Throwable) parseException19);
        parseException1.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.Throwable[] throwableArray32 = parseException19.getSuppressed();
        java.lang.Throwable[] throwableArray33 = parseException19.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray12 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException14);
        java.lang.Throwable[] throwableArray16 = parseException11.getSuppressed();
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray19 = parseException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = parseException18.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException18);
        parseException1.addSuppressed((java.lang.Throwable) parseException11);
        java.lang.Throwable[] throwableArray23 = parseException1.getSuppressed();
        java.lang.Throwable[] throwableArray24 = parseException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray7 = parseException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = parseException6.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException1.addSuppressed((java.lang.Throwable) parseException16);
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray23 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException22.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException22.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray30 = parseException29.getSuppressed();
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        parseException29.addSuppressed((java.lang.Throwable) parseException32);
        parseException22.addSuppressed((java.lang.Throwable) parseException29);
        parseException16.addSuppressed((java.lang.Throwable) parseException29);
        org.apache.commons.cli.ParseException parseException37 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException39 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray40 = parseException39.getSuppressed();
        org.apache.commons.cli.ParseException parseException42 = new org.apache.commons.cli.ParseException("");
        parseException39.addSuppressed((java.lang.Throwable) parseException42);
        parseException37.addSuppressed((java.lang.Throwable) parseException42);
        org.apache.commons.cli.ParseException parseException46 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException48 = new org.apache.commons.cli.ParseException("");
        parseException46.addSuppressed((java.lang.Throwable) parseException48);
        org.apache.commons.cli.ParseException parseException51 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray52 = parseException51.getSuppressed();
        java.lang.Throwable[] throwableArray53 = parseException51.getSuppressed();
        parseException46.addSuppressed((java.lang.Throwable) parseException51);
        org.apache.commons.cli.ParseException parseException56 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException58 = new org.apache.commons.cli.ParseException("");
        parseException56.addSuppressed((java.lang.Throwable) parseException58);
        org.apache.commons.cli.ParseException parseException61 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray62 = parseException61.getSuppressed();
        java.lang.Throwable[] throwableArray63 = parseException61.getSuppressed();
        parseException56.addSuppressed((java.lang.Throwable) parseException61);
        parseException46.addSuppressed((java.lang.Throwable) parseException61);
        parseException37.addSuppressed((java.lang.Throwable) parseException61);
        org.apache.commons.cli.ParseException parseException68 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray69 = parseException68.getSuppressed();
        org.apache.commons.cli.ParseException parseException71 = new org.apache.commons.cli.ParseException("");
        parseException68.addSuppressed((java.lang.Throwable) parseException71);
        java.lang.Throwable[] throwableArray73 = parseException68.getSuppressed();
        org.apache.commons.cli.ParseException parseException75 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray76 = parseException75.getSuppressed();
        java.lang.Throwable[] throwableArray77 = parseException75.getSuppressed();
        parseException68.addSuppressed((java.lang.Throwable) parseException75);
        org.apache.commons.cli.ParseException parseException80 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray81 = parseException80.getSuppressed();
        parseException68.addSuppressed((java.lang.Throwable) parseException80);
        parseException61.addSuppressed((java.lang.Throwable) parseException68);
        parseException16.addSuppressed((java.lang.Throwable) parseException68);
        java.lang.String str85 = parseException68.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "org.apache.commons.cli.ParseException: " + "'", str85, "org.apache.commons.cli.ParseException: ");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray8 = parseException7.getSuppressed();
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException10);
        java.lang.Throwable[] throwableArray12 = parseException7.getSuppressed();
        org.apache.commons.cli.ParseException parseException14 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray15 = parseException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = parseException14.getSuppressed();
        parseException7.addSuppressed((java.lang.Throwable) parseException14);
        org.apache.commons.cli.ParseException parseException19 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray20 = parseException19.getSuppressed();
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException19.addSuppressed((java.lang.Throwable) parseException22);
        java.lang.Throwable[] throwableArray24 = parseException19.getSuppressed();
        org.apache.commons.cli.ParseException parseException26 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray27 = parseException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = parseException26.getSuppressed();
        parseException19.addSuppressed((java.lang.Throwable) parseException26);
        parseException7.addSuppressed((java.lang.Throwable) parseException19);
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException34);
        org.apache.commons.cli.ParseException parseException37 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray38 = parseException37.getSuppressed();
        java.lang.Throwable[] throwableArray39 = parseException37.getSuppressed();
        parseException32.addSuppressed((java.lang.Throwable) parseException37);
        org.apache.commons.cli.ParseException parseException42 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray43 = parseException42.getSuppressed();
        org.apache.commons.cli.ParseException parseException45 = new org.apache.commons.cli.ParseException("");
        parseException42.addSuppressed((java.lang.Throwable) parseException45);
        java.lang.Throwable[] throwableArray47 = parseException42.getSuppressed();
        org.apache.commons.cli.ParseException parseException49 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray50 = parseException49.getSuppressed();
        java.lang.Throwable[] throwableArray51 = parseException49.getSuppressed();
        parseException42.addSuppressed((java.lang.Throwable) parseException49);
        parseException32.addSuppressed((java.lang.Throwable) parseException42);
        org.apache.commons.cli.ParseException parseException55 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray56 = parseException55.getSuppressed();
        org.apache.commons.cli.ParseException parseException58 = new org.apache.commons.cli.ParseException("");
        parseException55.addSuppressed((java.lang.Throwable) parseException58);
        java.lang.Throwable[] throwableArray60 = parseException55.getSuppressed();
        org.apache.commons.cli.ParseException parseException62 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray63 = parseException62.getSuppressed();
        org.apache.commons.cli.ParseException parseException65 = new org.apache.commons.cli.ParseException("");
        parseException62.addSuppressed((java.lang.Throwable) parseException65);
        parseException55.addSuppressed((java.lang.Throwable) parseException62);
        org.apache.commons.cli.ParseException parseException69 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray70 = parseException69.getSuppressed();
        org.apache.commons.cli.ParseException parseException72 = new org.apache.commons.cli.ParseException("");
        parseException69.addSuppressed((java.lang.Throwable) parseException72);
        java.lang.Throwable[] throwableArray74 = parseException69.getSuppressed();
        org.apache.commons.cli.ParseException parseException76 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray77 = parseException76.getSuppressed();
        java.lang.Throwable[] throwableArray78 = parseException76.getSuppressed();
        parseException69.addSuppressed((java.lang.Throwable) parseException76);
        parseException55.addSuppressed((java.lang.Throwable) parseException69);
        parseException32.addSuppressed((java.lang.Throwable) parseException55);
        parseException19.addSuppressed((java.lang.Throwable) parseException55);
        org.apache.commons.cli.ParseException parseException84 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray85 = parseException84.getSuppressed();
        org.apache.commons.cli.ParseException parseException87 = new org.apache.commons.cli.ParseException("");
        parseException84.addSuppressed((java.lang.Throwable) parseException87);
        parseException19.addSuppressed((java.lang.Throwable) parseException84);
        parseException1.addSuppressed((java.lang.Throwable) parseException19);
        java.lang.String str91 = parseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!" + "'", str91, "org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.cli.ParseException parseException2 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray5 = parseException4.getSuppressed();
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        parseException4.addSuppressed((java.lang.Throwable) parseException7);
        parseException2.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException13 = new org.apache.commons.cli.ParseException("");
        parseException11.addSuppressed((java.lang.Throwable) parseException13);
        org.apache.commons.cli.ParseException parseException16 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray17 = parseException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = parseException16.getSuppressed();
        parseException11.addSuppressed((java.lang.Throwable) parseException16);
        parseException7.addSuppressed((java.lang.Throwable) parseException11);
        java.lang.Throwable[] throwableArray21 = parseException7.getSuppressed();
        org.apache.commons.cli.ParseException parseException23 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        parseException23.addSuppressed((java.lang.Throwable) parseException25);
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        org.apache.commons.cli.ParseException parseException29 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException31 = new org.apache.commons.cli.ParseException("");
        parseException29.addSuppressed((java.lang.Throwable) parseException31);
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray35 = parseException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = parseException34.getSuppressed();
        parseException29.addSuppressed((java.lang.Throwable) parseException34);
        parseException25.addSuppressed((java.lang.Throwable) parseException29);
        java.lang.Throwable[] throwableArray39 = parseException25.getSuppressed();
        parseException7.addSuppressed((java.lang.Throwable) parseException25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) parseException7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.ParseException cannot be cast to class java.lang.Class (org.apache.commons.cli.ParseException is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.Throwable[] throwableArray5 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException7 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException9 = new org.apache.commons.cli.ParseException("");
        parseException7.addSuppressed((java.lang.Throwable) parseException9);
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray13 = parseException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = parseException12.getSuppressed();
        parseException7.addSuppressed((java.lang.Throwable) parseException12);
        parseException3.addSuppressed((java.lang.Throwable) parseException7);
        org.apache.commons.cli.ParseException parseException18 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray19 = parseException18.getSuppressed();
        org.apache.commons.cli.ParseException parseException21 = new org.apache.commons.cli.ParseException("");
        parseException18.addSuppressed((java.lang.Throwable) parseException21);
        java.lang.Throwable[] throwableArray23 = parseException18.getSuppressed();
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException18.addSuppressed((java.lang.Throwable) parseException25);
        org.apache.commons.cli.ParseException parseException30 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray31 = parseException30.getSuppressed();
        parseException18.addSuppressed((java.lang.Throwable) parseException30);
        java.lang.Throwable[] throwableArray33 = parseException30.getSuppressed();
        parseException3.addSuppressed((java.lang.Throwable) parseException30);
        org.apache.commons.cli.ParseException parseException36 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException38 = new org.apache.commons.cli.ParseException("");
        parseException36.addSuppressed((java.lang.Throwable) parseException38);
        org.apache.commons.cli.ParseException parseException41 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray42 = parseException41.getSuppressed();
        java.lang.Throwable[] throwableArray43 = parseException41.getSuppressed();
        parseException36.addSuppressed((java.lang.Throwable) parseException41);
        org.apache.commons.cli.ParseException parseException46 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray47 = parseException46.getSuppressed();
        org.apache.commons.cli.ParseException parseException49 = new org.apache.commons.cli.ParseException("");
        parseException46.addSuppressed((java.lang.Throwable) parseException49);
        java.lang.Throwable[] throwableArray51 = parseException46.getSuppressed();
        org.apache.commons.cli.ParseException parseException53 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray54 = parseException53.getSuppressed();
        java.lang.Throwable[] throwableArray55 = parseException53.getSuppressed();
        parseException46.addSuppressed((java.lang.Throwable) parseException53);
        parseException36.addSuppressed((java.lang.Throwable) parseException46);
        org.apache.commons.cli.ParseException parseException59 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray60 = parseException59.getSuppressed();
        java.lang.Throwable[] throwableArray61 = parseException59.getSuppressed();
        java.lang.Throwable[] throwableArray62 = parseException59.getSuppressed();
        parseException36.addSuppressed((java.lang.Throwable) parseException59);
        java.lang.Throwable[] throwableArray64 = parseException59.getSuppressed();
        parseException3.addSuppressed((java.lang.Throwable) parseException59);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("org.apache.commons.cli.ParseException: org.apache.commons.cli.ParseException: hi!");
        org.apache.commons.cli.ParseException parseException3 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray4 = parseException3.getSuppressed();
        org.apache.commons.cli.ParseException parseException6 = new org.apache.commons.cli.ParseException("");
        parseException3.addSuppressed((java.lang.Throwable) parseException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException6);
        org.apache.commons.cli.ParseException parseException10 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException12 = new org.apache.commons.cli.ParseException("");
        parseException10.addSuppressed((java.lang.Throwable) parseException12);
        org.apache.commons.cli.ParseException parseException15 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray16 = parseException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = parseException15.getSuppressed();
        parseException10.addSuppressed((java.lang.Throwable) parseException15);
        org.apache.commons.cli.ParseException parseException20 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException22 = new org.apache.commons.cli.ParseException("");
        parseException20.addSuppressed((java.lang.Throwable) parseException22);
        org.apache.commons.cli.ParseException parseException25 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray26 = parseException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = parseException25.getSuppressed();
        parseException20.addSuppressed((java.lang.Throwable) parseException25);
        parseException10.addSuppressed((java.lang.Throwable) parseException25);
        parseException1.addSuppressed((java.lang.Throwable) parseException25);
        org.apache.commons.cli.ParseException parseException32 = new org.apache.commons.cli.ParseException("");
        org.apache.commons.cli.ParseException parseException34 = new org.apache.commons.cli.ParseException("");
        parseException32.addSuppressed((java.lang.Throwable) parseException34);
        parseException25.addSuppressed((java.lang.Throwable) parseException34);
        java.lang.Class<?> wildcardClass37 = parseException34.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.cli.ParseException parseException1 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray2 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException4 = new org.apache.commons.cli.ParseException("");
        parseException1.addSuppressed((java.lang.Throwable) parseException4);
        java.lang.Throwable[] throwableArray6 = parseException1.getSuppressed();
        org.apache.commons.cli.ParseException parseException8 = new org.apache.commons.cli.ParseException("");
        java.lang.Throwable[] throwableArray9 = parseException8.getSuppressed();
        org.apache.commons.cli.ParseException parseException11 = new org.apache.commons.cli.ParseException("");
        parseException8.addSuppressed((java.lang.Throwable) parseException11);
        parseException1.addSuppressed((java.lang.Throwable) parseException8);
        java.lang.Throwable[] throwableArray14 = parseException8.getSuppressed();
        java.lang.Class<?> wildcardClass15 = parseException8.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

