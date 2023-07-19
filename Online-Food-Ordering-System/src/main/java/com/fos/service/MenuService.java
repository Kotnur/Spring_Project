package com.fos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fos.entity.Menu;
import com.fos.repository.MenuRepository;

@Service
public class MenuService {
	
	private MenuRepository menuRepository;
	
	public MenuService(MenuRepository menuRepository) {this.menuRepository = menuRepository;}
	
	public List<Menu>getAllMenus(){
		return this.menuRepository.findAll();
		}
	}


