package com.grandhunterman.definitelynotvanillaminecraft.proxy;


import com.grandhunterman.definitelynotvanillaminecraft.init.ModItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders() {
        ModItems.registerRenders();
    }
}

