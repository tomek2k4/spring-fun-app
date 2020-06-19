package com.tmaslon.springfunapp

import com.tmaslon.springfunapp.purespring.SampleBean1
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan

//@SpringBootApplication
@ComponentScan
class SpringfunappApplication

fun main(args: Array<String>) {
//	runApplication<SpringfunappApplication>(*args)
    val applicationContext = AnnotationConfigApplicationContext(SpringfunappApplication::class.java)
    val sampleBean1 = applicationContext.getBean(SampleBean1::class.java)
    sampleBean1.businessLogic()
}
