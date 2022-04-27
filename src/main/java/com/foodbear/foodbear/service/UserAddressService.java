package com.foodbear.foodbear.service;

import com.foodbear.foodbear.entities.UserAddress;
import com.foodbear.foodbear.repo.UserAddressDaoJpa;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@Service("userAddressService")
public class UserAddressService {

    private UserAddressDaoJpa userAddressDaoJpa;


    public List<UserAddress> getAllAddress(){
        return userAddressDaoJpa.findAll();
    }

    public UserAddress getAddressById(Long id){
        return userAddressDaoJpa.findById(id).get();
    }

    public UserAddress create(UserAddress userAddress){
        return userAddressDaoJpa.save(userAddress);
    }

    public UserAddress update(Long id, UserAddress userAddress){

        String adressLine = userAddress.getAdressLine();
        Long zipcode = userAddress.getZipcode();
        String city = userAddress.getCity();
        UserAddress getAddress = userAddressDaoJpa.getById(id);

        if (userAddress.getAdressLine()!=null){
            getAddress.setAdressLine(adressLine);
        }
        if (userAddress.getZipcode()!=null) {
            getAddress.setZipcode(zipcode);
        }
        if (userAddress.getCity()!=null) {
            getAddress.setCity(city);
        }
        return userAddressDaoJpa.save(getAddress);
    }

    public String delete(Long id){
        userAddressDaoJpa.deleteById(id);
        return "USER_ADDRESS_HAS_BEEN_DELETED";
    }
}
