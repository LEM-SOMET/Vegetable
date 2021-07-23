package com.mmcompany.goldencoraladdison.Models

import java.io.Serializable

data class VegetablesModels (var v_img: Int, var v_name: String, var v_code: String,
                        var v_qty: Int, var v_price: Double, var v_total: Double,
                        var payment: Double): Serializable{

}