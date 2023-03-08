/*
 * Copyright (C) filoghost and contributors
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package me.filoghost.chestcommands.icon;

import java.util.List;

public class CyclicIcon extends InternalConfigurableIcon {

    private final List<InternalConfigurableIcon> iconList;
    private int index = 0;

    public CyclicIcon(List<InternalConfigurableIcon> iconList) {
        super(iconList.get(0).getMaterial());
        this.iconList = iconList;
        this.refresh();
    }

    public void refresh() {
        this.setLore(this.iconList.get(this.index).getLore());
        this.setClickPermission(this.iconList.get(this.index).getClickPermission());
        this.setMaterial(this.iconList.get(this.index).getMaterial());
        this.setName(this.iconList.get(this.index).getName());
        this.setPlaceholdersEnabled(this.iconList.get(this.index).isPlaceholdersEnabled());
        this.setBannerColor(this.iconList.get(this.index).getBannerColor());
        this.setBannerPatterns(this.iconList.get(this.index).getBannerPatterns());
        this.setClickResult(this.iconList.get(this.index).getClickResult());
        this.setLeftActions(this.iconList.get(this.index).getLeftActions());
        this.setRightActions(this.iconList.get(this.index).getRightActions());
        this.setLeftShiftActions(this.iconList.get(this.index).getLeftShiftActions());
        this.setRightShiftActions(this.iconList.get(this.index).getRightShiftActions());
        this.setNoClickPermissionMessage(this.iconList.get(this.index).getNoClickPermissionMessage());
        this.setRequiredExpLevel(this.iconList.get(this.index).getRequiredExpLevel());
        this.setRequiredItems(this.iconList.get(this.index).getRequiredItems());
        this.setRequiredMoney(this.iconList.get(this.index).getRequiredMoney());
        this.setViewPermission(this.iconList.get(this.index).getViewPermission());
        this.setAmount(this.iconList.get(this.index).getAmount());
        this.setDurability(this.iconList.get(this.index).getDurability());
        this.setEnchantments(this.iconList.get(this.index).getEnchantments());
        this.setNBTData(this.iconList.get(this.index).getNBTData());
        this.setSkullOwner(this.iconList.get(this.index).getSkullOwner());
        this.setLeatherColor(this.iconList.get(this.index).getLeatherColor());
    }

    public void next() {
        this.index = ++index % this.iconList.size();
        refresh();
    }

    public void prev() {
        if (--index < 0) this.index = this.iconList.size() - 1;
        refresh();
    }


}
