package com.example.demo.cont;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@Slf4j
public class MemberContTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @DisplayName("updateTodo_To-Do 수정")
    @Test
    public void testMyApi() {
        String url = "/hello2";

        // RestAPI 호출
        ResponseEntity<Object> responseEntity = restTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY, Object.class);
        Object responseBody = responseEntity.getBody();
        log.info("Test : " + responseBody);

        // 응답 확인
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertNotNull(responseEntity.getBody());
        // 추가적인 응답 검증 로직 작성
    }
}