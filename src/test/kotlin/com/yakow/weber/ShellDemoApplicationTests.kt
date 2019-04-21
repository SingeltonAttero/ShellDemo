package com.yakow.weber

import com.yakow.weber.service.AnagramService
import com.yakow.weber.service.SimpleAnagramService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes =[SimpleAnagramService::class] )
class ShellDemoApplicationTests {

	@Autowired
	lateinit var anagramService:AnagramService

	@Test
	fun contextLoads() {

	}


}
