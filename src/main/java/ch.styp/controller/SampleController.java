package ch.styp.controller; /**
 * Created by martin on 08.10.16.
 */

import ch.styp.AppConfig;
import ch.styp.dao.CustomerDao;
import ch.styp.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
public class SampleController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/addCustomer")
    @ResponseBody
    public String addCustomer(){

        customerDao.save(new Customer("John", "Doe"));

        return "Added Test Customer!";
    }

    @RequestMapping("/customers")
    @ResponseBody
    public String getAllCustomers(){
        StringBuilder stringBuilder = new StringBuilder();
        Iterable<Customer> allCustomers = customerDao.findAll();
        for(Customer c : allCustomers){
            stringBuilder.append(c.toString());
        }

        return stringBuilder.toString();
    }


}
