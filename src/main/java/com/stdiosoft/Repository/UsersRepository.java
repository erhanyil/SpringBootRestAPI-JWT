package com.stdiosoft.Repository;

import com.stdiosoft.Library.DatabaseLibrary;
import com.stdiosoft.Response.ReturnResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersRepository extends ReturnResponse {

    @Autowired
    private DatabaseLibrary dbl;

    public ReturnResponse get() {

        addResponse("dev_users", dbl.runQuery("SELECT * FROM dev_users"));

        return response();
    }
    public ReturnResponse get(Long id) {

        addResponse("dev_users", dbl.runQuery("SELECT * FROM dev_users WHERE id="+id.toString()));

        return response();
    }

    public ReturnResponse getP() {

        addResponse("tblBills", dbl.runQuery("SELECT * FROM tblbills"));

        return response();
    }
    public ReturnResponse getP(Long id) {

        addResponse("tblBills", dbl.runQuery("SELECT * FROM tblbills WHERE reminder_ID="+id.toString()));

        return response();
    }

}
