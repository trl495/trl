package com.javatpoint.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "<center><h1>This is first time of deploying the spring boot application  on server by - Venkat Trl</h1></center>";
}
}
