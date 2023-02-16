/*
 * Copyright (C) filoghost and contributors
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package me.filoghost.chestcommands.api;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * Callback to handle a player clicking on an icon.
 *
 * @since 1
 */
public interface ClickHandler {

    /**
     * Called when a player left-clicks on an icon associated with this handler.
     *
     * @param menuView the menu view inside which the icon was clicked
     * @param clicker  the player that clicked an icon (identical to {@link MenuView#getViewer()})
     * @param shift    true if the player performs shift+click
     * @since 1
     */
    void onLeftClick(@NotNull MenuView menuView, @NotNull Player clicker, boolean shift);

    /**
     * Called when a player right-clicks on an icon associated with this handler.
     *
     * @param menuView the menu view inside which the icon was clicked
     * @param clicker  the player that clicked an icon (identical to {@link MenuView#getViewer()})
     * @param shift    true if the player performs shift+click
     * @since 1
     */
    void onRightClick(@NotNull MenuView menuView, @NotNull Player clicker, boolean shift);

}
