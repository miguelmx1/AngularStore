package com.moram;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/loginService")
    public Result loginService(@RequestParam(value="username", defaultValue="") String username, 
    		@RequestParam(value="password", defaultValue="") String password) 
    {
    	Result response = null;
    	if ( (username != null) && (username.equals("miguel.mora")) )
    	{
    		if ( (password != null) && (password.equals("T3st")) )
    		{
        		response = new Result(counter.incrementAndGet(),
                        0,
                        "Access Granted");
    		}
    		else
    		{
        		response = new Result(counter.incrementAndGet(),
                        1002,
                        "Password for user name: "+ username + " does not match");
    		}
    	}
    	else
    	{
    		response = new Result(counter.incrementAndGet(),
                    1001,
                    "User Name: "+ username + " does not exists");
    	}
    	return response;
    }
}
