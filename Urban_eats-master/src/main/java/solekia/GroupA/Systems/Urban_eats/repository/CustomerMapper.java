package solekia.GroupA.Systems.Urban_eats.repository;

import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface CustomerMapper {
    @Select("select * from customer where ")
    public List<CustomerModel> findEmail(String email);
}