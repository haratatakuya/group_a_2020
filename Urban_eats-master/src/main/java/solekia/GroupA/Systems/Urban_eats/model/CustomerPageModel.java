package solekia.GroupA.Systems.Urban_eats.model;

import java.util.List;

import solekia.GroupA.Systems.Urban_eats.repository.CustomerModel;

public class CustomerPageModel {
    public List<CustomerModel> list;

    public String title;
    public int customer_id;
    public String first_name;
    public String last_name;
    public String email;
}