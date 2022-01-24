package com.kata.gbsuftblai

import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GbsuFtbLaiApplicationTests {

    private val gbsuFtbLaiApplicationTest: GbsuFtbLaiService = GbsuFtbLaiService()

    @Test
    fun it_should_return_0() {
        // Given
        val number = 0;
        // When
        val result = gbsuFtbLaiApplicationTest.convertNumber(number);
        // Then
        assertThat(result).isEqualTo("0");
    }

    @Test
    fun it_should_return_1() {
        // Given
        val number = 1;
        // When
        val result = gbsuFtbLaiApplicationTest.convertNumber(number);
        // Then
        assertThat(result).isEqualTo("1");
    }

    @Test
    fun it_should_return_GbsuGbsu() {
        // Given
        val number = 3;
        // When
        val result = gbsuFtbLaiApplicationTest.convertNumber(number);
        // Then
        assertThat(result).isEqualTo("GbsuGbsu");
    }

    @Test
    fun it_should_return_FtbFtb() {
        // Given
        val number = 5;
        // When
        val result = gbsuFtbLaiApplicationTest.convertNumber(number);
        // Then
        assertThat(result).isEqualTo("FtbFtb");
    }

    @Test
    fun it_should_return_Lai() {
        // Given
        val number = 7;
        // When
        val result = gbsuFtbLaiApplicationTest.convertNumber(number);
        // Then
        assertThat(result).isEqualTo("Lai");
    }

    @Test
    fun it_should_return_GbsuFtbFtb() {
        // Given
        val number = 15;
        // When
        val result = gbsuFtbLaiApplicationTest.convertNumber(number);
        // Then
        assertThat(result).isEqualTo("GbsuFtbFtb");
    }

    @Test
    fun it_should_return_GbsuFtb() {
        // Given
        val number = 51;
        // When
        val result = gbsuFtbLaiApplicationTest.convertNumber(number);
        // Then
        assertThat(result).isEqualTo("GbsuFtb");
    }

    @Test
    fun it_should_return_FtbGbsu() {
        // Given
        val number = 53;
        // When
        val result = gbsuFtbLaiApplicationTest.convertNumber(number);
        // Then
        assertThat(result).isEqualTo("FtbGbsu");
    }

    @Test
    fun it_should_return_17() {
        // Given
        val number = 17;
        // When
        val result = gbsuFtbLaiApplicationTest.convertNumber(number);
        // Then
        assertThat(result).isEqualTo("Lai");
    }

}
