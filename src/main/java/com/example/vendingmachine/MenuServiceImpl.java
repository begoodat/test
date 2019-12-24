package com.example.vendingmachine;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class MenuServiceImpl implements MenuService{

    @Autowired
    MenuRepository menuRepository;

    @Override
    public String addMenu(Menu menu) {
        //  FIXME   빈 파라미터가 넘어왔을 때 어떤 에러가 발생할까?
        menuRepository.save(menu);
        return String.format("Menu [%s] ADD SUCCESS!!", menu.toString());
    }

    @Override
    public String editMenu(Menu menu) {
        //  FIXME   메뉴명을 아이디로 했을 때, 동일한 아이디를 입력하면 어떻게 될까?
        //  TODO    오 옵셔널로 바꾸라고 알려주네. 널일 경우에 그럼 어떻게 되지?
        Menu menuEdit = menuRepository.findById(menu.getName())
                .orElseThrow(() -> new NotFoundMenuException(menu.getName()));
        menuRepository.save(menuEdit);
        return menuEdit.toString();
    }

    @Override
    public String deleteMenu(String id) {
        Menu menu = menuRepository.findById(id)
                .orElseThrow(() -> new NotFoundMenuException(id));
        menuRepository.delete(menu);
        return String.format("Menu [%s] DELETE SUCCESS!!", menu.toString());
    }

    @Override
    public List<Menu> getMenuList() {
        return menuRepository.findAll();
    }
}
