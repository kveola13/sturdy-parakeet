package com.kveola13;

import com.kveola13.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.kveola13"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calendarFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar calendar() throws Exception {
        return calendarFactory().getObject();
    }

    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        //speakerService.setRepository(getSpeakerRepository());
        //return new SpeakerServiceImpl(getSpeakerRepository());
        return new SpeakerServiceImpl();
    }
    */

    /*
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
    */
}
