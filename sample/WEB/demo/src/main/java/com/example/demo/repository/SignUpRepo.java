/*package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Train;

@Repository
public interface TrainRepo extends JpaRepository<Train, Integer> {
}*/

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SignUp;

@Repository
public interface SignUpRepo extends JpaRepository<SignUp, Integer> {

}
