package org.niray.ctrl

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by Mac on 16/10/21.
 */
@Controller
class UserPostCtrl {

    @RequestMapping(value = "addUser", method = arrayOf(RequestMethod.POST))
    @ResponseBody
    fun postTest(@RequestParam(value = "name",required = false) name: String): String {
        return name
    }

    @RequestMapping(value = "getUser", method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun getTest(@RequestParam(value = "name") name: String): String {
        return name
    }

}
