package id.co.setyowidi.rabbitmqtraining.controller;

import id.co.setyowidi.rabbitmqtraining.model.Staff;
import id.co.setyowidi.rabbitmqtraining.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rabbitmq-testing")
public class RabbitMQController {

    @Autowired
    RabbitMQSender rmqSender ;

    @GetMapping(value="/producer")
    public String producer(@RequestParam("staffName") String staffName, @RequestParam("staffId") String staffId){
        Staff staff = new Staff();
        staff.setStaffId(staffId);
        staff.setStaffName(staffName);
        rmqSender.send(staff);
        return "message sent to RMQ";
    }

}
