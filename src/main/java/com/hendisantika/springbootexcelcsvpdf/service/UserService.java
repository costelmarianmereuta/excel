package com.hendisantika.springbootexcelcsvpdf.service;

import com.hendisantika.springbootexcelcsvpdf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-excel-csv-pdf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/02/18
 * Time: 20.53
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserService {


    public List<User> findAllUsers() {

        User user=new User("firstname","lastname",10,"job","company","adres","bxl","belgique","00324859552");
        User user1=new User("firstname1","lastname1",10,"job","company","adres","bxl","belgique","00324859552");
        User user2=new User("firstname","lastname",10,"job","company","adres","bxl","belgique","00324859552");
        User user3=new User("firstname1","lastname1",10,"job","company","adres","bxl","belgique","00324859552");
        List<User> users =Arrays.asList(user,user1, user2, user3);
        return users;

    }
}