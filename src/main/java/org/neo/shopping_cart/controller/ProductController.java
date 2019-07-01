package org.neo.shopping_cart.controller;

import org.neo.shopping_cart.vo.Product;
import org.springframework.web.bind.annotation.*;

/**
 * Created by NeoJiang on 27/6/2019.
 */
@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProductController {

    private Product macbook = new Product("1"
            ,"https://i0.hdslb.com/bfs/article/d8bc6e442dc7027eb09c571036626448d0a23b7d.jpg"
            ,1500
            ,"MacBook");

    private Product iphone = new Product("2"
            ,"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1561908571547&di=37ab642bd85387812d3870911f870ba7&imgtype=0&src=http%3A%2F%2Fwww.yn360sj.com%2Fimages%2F201801%2Fgoods_img%2F917_P_1516778275815.jpg"
            ,999
            ,"iPhone");

    // Return product mock information per id
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {

        if(macbook.getId().equals(id)) {
            return macbook;
        } else if (iphone.getId().equals(id)) {
            return iphone;
        } else {
            return new Product("0","",0,"");
        }

    }
}
