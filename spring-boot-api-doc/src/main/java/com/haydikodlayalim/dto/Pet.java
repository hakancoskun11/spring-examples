package com.haydikodlayalim.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "Benim Pet nesnem",description = "bemim pet")
public class Pet {

    @ApiModelProperty(value = "Pet nesnesinin tekil Id alani")
    private int id;

    @ApiModelProperty(value = "Pet nesnesinin adı alani")
    private String name;

    @ApiModelProperty(value = "Pet nesnesinin tarih alani")
    private Date date;

}
