/*
 *
 * Copyright 2017-2018 549477611@qq.com(xiaoyu)
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.happylifeplat.tcc.demo.dubbo.inventory.api.service;

import com.happylifeplat.tcc.annotation.Tcc;
import com.happylifeplat.tcc.demo.dubbo.inventory.api.dto.InventoryDTO;
import com.happylifeplat.tcc.demo.dubbo.inventory.api.entity.Inventory;

public interface InventoryService {


    /**
     * 扣减库存操作
     * 这一个tcc接口
     * @param inventoryDTO 库存DTO对象
     * @return true
     */
    @Tcc
    Boolean decrease(InventoryDTO inventoryDTO);



    @Tcc
    String mockWithTryException(InventoryDTO inventoryDTO);


    @Tcc
    Boolean mockWithTryTimeout(InventoryDTO inventoryDTO);


    @Tcc
    String mockWithConfirmException(InventoryDTO inventoryDTO);


    @Tcc
    Boolean mockWithConfirmTimeout(InventoryDTO inventoryDTO);


}
