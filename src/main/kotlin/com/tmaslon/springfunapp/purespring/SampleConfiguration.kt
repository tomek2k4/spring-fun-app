package com.tmaslon.springfunapp.purespring

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SampleConfiguration {

    @Bean
    fun sampleBean1(): SampleBean1 = SampleBean1()

}