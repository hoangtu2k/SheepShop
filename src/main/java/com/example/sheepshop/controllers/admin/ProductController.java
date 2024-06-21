package com.example.sheepshop.controllers.admin;

import com.example.sheepshop.entitys.*;
import com.example.sheepshop.services.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/product/")
public class ProductController {

    @Autowired
    private BrandService brandService;

    @Autowired
    private CollarStyleService collarStyleService;

    @Autowired
    private ColorService colorService;

    @Autowired
    private SizeService sizeService;

    @Autowired
    private MaterialService materialService;

    @Autowired
    private CategoryService categoryService;


    @Autowired
    private ProductService productService;

    @GetMapping("hien-thi")
    public String product(Model model) {

        List<CollarStyle> collarStyles = collarStyleService.getCollarStyleList();
        model.addAttribute("collarStyles", collarStyles);

        List<Brand> brands = brandService.getBrandList();
        model.addAttribute("brands", brands);

        List<Size> sizes = sizeService.getSizeList();
        model.addAttribute("sizes", sizes);

        List<Color> colors = colorService.getColorList();
        model.addAttribute("colors", colors);

        List<Material> materials = materialService.getMaterialList();
        model.addAttribute("materials", materials);

        List<Category> categories = categoryService.getCategoryList();
        model.addAttribute("categories", categories);

        List<Product> products = productService.getAll(); // Lấy danh sách sản phẩm từ ProductService
        model.addAttribute("products", products); // Gán danh sách sản phẩm vào model
        return "admin/product/product";
    }

    @GetMapping("hien-thi/{id}")
    public String viewUpdate(@PathVariable("id") String id, Model model) {
            Product product = productService.findById(Long.valueOf(id));
            model.addAttribute("product", product);
            return "admin/product/product";
    }

    public String viewUpdate(
            Model model,
            @ModelAttribute("product") Product product,
            @RequestParam("code") String code,
            @RequestParam("name") String name,
            @RequestParam("quantity") String quantity,
            @RequestParam("price") String price,
            @RequestParam("description") String description,
            @RequestParam("brand") Brand brandId,
            @RequestParam("collarStyle") CollarStyle collarStyleId,
            @RequestParam("color") Color colorId,
            @RequestParam("size") Size sizeId,
            @RequestParam("material") Material materialId,
            @RequestParam("category") Category categoryId,
            @RequestParam("image") String imageId
    ) {
        return "redirect:/admin/product/hien-thi";
    }


}
