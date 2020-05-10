package com.kavy.takeoutfoodmenu.entity;

import java.io.Serializable;
import lombok.Data;
import java.util.Date;
import java.util.List;

/**
*  t_menu
* @author kavy 2020-05-09
*/
@Data
public class TMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * id
    */
    private Integer id;

    /**
    * name
    */
    private String name;

    /**
    * price
    */
    private Double price;

    /**
    * flavor
    */
    private String flavor;

    /**
    * tid
    */
    private Integer tid;

    public TMenu() {
    }

}
