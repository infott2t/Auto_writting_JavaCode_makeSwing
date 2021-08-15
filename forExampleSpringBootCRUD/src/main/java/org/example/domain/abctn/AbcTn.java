package org.example.domain.abctn;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.BaseTimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible.
//  AbcTn.java       File. Textting.
// import, javax.persistance.Entity, ...GenerationValue, ...GenerationType, ...Id.
//
@Getter
@NoArgsConstructor
@Entity
public class AbcTn extends BaseTimeEntity {
    @Id //primary key field.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment.
    private Long abId;

    private String abc;


    @Builder
    public AbcTn(String abc){
        this.abc = abc;
    }

    public void update(  String abc){
        this.abc = abc;
    }
}
