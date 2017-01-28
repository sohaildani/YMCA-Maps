package com.manan.appteam.ymcamap;

/**
 * Created by pc on 28-01-2017.
 */

import com.google.android.gms.maps.model.LatLng;

import java.util.Collection;

/**
 * A collection of ClusterItems that are nearby each other.
 */
public interface Cluster<T extends ClusterItem> {
    public LatLng getPosition();

    Collection<T> getItems();

    int getSize();
}
