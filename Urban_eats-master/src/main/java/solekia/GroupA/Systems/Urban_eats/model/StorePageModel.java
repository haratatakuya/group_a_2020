package solekia.GroupA.Systems.Urban_eats.model;

import java.util.List;

import solekia.GroupA.Systems.Urban_eats.repository.StoreModel;

public class StorePageModel {
    public List<StoreModel> list;
    public int store_id;
    public String store_name;
    public String address_name;
    public int category_id;
    public String category;
}