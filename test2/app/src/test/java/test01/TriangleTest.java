package test01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(0, 4, 5);
        assertEquals("输入错误", type);
    }
    @Test
    @DisplayName("不等边三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 4, 6);
        assertEquals("不等边三角形", type);
    }
    @ParameterizedTest
    @CsvSource({
            "1,2,3,非三角形",
            "-1,2,3,输入错误"
    })
    void testWithCsvSource(int a,int b,int c,String expected) {
        Triangle triangle1 = new Triangle();
        assertEquals(expected, triangle1.classify(a,b,c));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/triangle1.csv")
    void test_csv_file_source1(int a, int b, int c, String expected) {
        Triangle triangle = new Triangle();
        assertEquals(expected, triangle.classify(a,b,c));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/triangle2.csv")
    void test_csv_file_source2(int a, int b, int c, String expected) {
        Triangle triangle = new Triangle();
        assertEquals(expected, triangle.classify(a,b,c));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/triangle3.csv")
    void test_csv_file_source3(int a, int b, int c, String expected) {
        Triangle triangle = new Triangle();
        assertEquals(expected, triangle.classify(a,b,c));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/triangle4.csv")
    void test_csv_file_source4(int a, int b, int c, String expected) {
        Triangle triangle = new Triangle();
        assertEquals(expected, triangle.classify(a,b,c));
    }
}