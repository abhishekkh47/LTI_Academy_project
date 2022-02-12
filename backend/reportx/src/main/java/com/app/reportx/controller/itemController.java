package com.app.reportx.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.reportx.ResourceNotFoundException;
import com.app.reportx.model.Items;
import com.app.reportx.repository.ItemsRepository;


//import com.app.reportx.repository.ReportRepository;

@RestController
public class itemController {
	
	@Autowired
	private ItemsRepository itemsrepo;
	
	@PostMapping("/itemsadded")
	@CrossOrigin(origins = "http://localhost:4200")
	public Items addreport(@RequestBody Items item) {
//		System.out.println(item);
		return itemsrepo.save(item);
	}
	
    @GetMapping("/items")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<Items> fetchreports() {
        return itemsrepo.findAll();
    }
    
    @GetMapping("/itemsexp")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<Items> fetchexpitems() {
        return itemsrepo.findByexpdate();
    }
    
    @GetMapping("/itemsmanfdate/{manfdate}")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<Items> fetchmanfitems(@PathVariable(value = "manfdate") String manfdate) {
        return itemsrepo.findBymanfdate(manfdate);
    }
    
    @GetMapping("/itemsexpdate/{expdate}")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<Items> fetchexpitemsdate(@PathVariable(value = "expdate") String expdate) {
        return itemsrepo.findByexpdate(expdate);
    }
    
    @GetMapping("/itemsdesc/{itemdesc}")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<Items> fetchitemsdesc(@PathVariable(value = "itemdesc") String itemdesc) {
        return itemsrepo.findBydesc(itemdesc);
    }
    
    @GetMapping("/finditem/{itemname}")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<Items> fetchitemsbyname(@PathVariable(value = "itemname") String itemname) {    	
//    public List<Items> fetchitemsbyname(@PathVariable String itemname) {
    	System.out.println(itemname);
        return itemsrepo.findByName(itemname);
    }

    @DeleteMapping("/deleteitems/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<Items> deletereport(@PathVariable int id) {
    	itemsrepo.deleteById(id);
        return itemsrepo.findAll();
    }
    
    @PutMapping("/updateitems/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Items> updateitems(@PathVariable(value = "id") int itemId,
         @Validated @RequestBody Items itemDetails) throws ResourceNotFoundException {
        Items items=null;
		try {
			items = itemsrepo.findById(itemId)
			.orElseThrow(() -> new ResourceNotFoundException("Item not found for this id :: " + itemId));
		} catch (ResourceNotFoundException e1) {
			e1.printStackTrace();
		}

//		Items items;
		System.out.println(items);
        items.setItemname(itemDetails.getItemname());
        items.setManfdate(itemDetails.getManfdate());
        items.setExpdate(itemDetails.getExpdate());
        items.setItemdesc(itemDetails.getItemdesc());
        items.setPrice(itemDetails.getPrice());
        Items updatedList=null;
		try {
			updatedList = itemsrepo.save(items);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return ResponseEntity.ok(updatedList);
    }
}
