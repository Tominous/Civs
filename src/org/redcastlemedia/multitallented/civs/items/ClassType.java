package org.redcastlemedia.multitallented.civs.items;

import org.redcastlemedia.multitallented.civs.util.CVItem;

import java.util.ArrayList;
import java.util.List;

public class ClassType extends CivItem {
    private final List<CivItem> children;

    public ClassType(List<String> reqs, String name, CVItem icon, double price, String permission, List<CivItem> children) {
        super(reqs,
                false,
                ItemType.CLASS,
                name,
                icon.getMat(),
                icon.getDamage(),
                children.isEmpty() ? 1 : children.size(),
                0,
                1,
                price,
                permission,
                new ArrayList<String>());
        this.children = children;
    }

    public List<CivItem> getChildren() {
        return children;
    }
}