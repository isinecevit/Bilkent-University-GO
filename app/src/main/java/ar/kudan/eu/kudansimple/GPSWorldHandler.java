package ar.kudan.eu.kudansimple;


import android.util.Log;

import java.util.ArrayList;

/**
 * This class handles the GPS objects around the world;
 */
public class GPSWorldHandler {

    private ArrayList<GPSImageNode> gpsObjectList;
    private GPSManager gpsManager;

    /**
     * Constructs an empty GPSWorldHandler object
     *
     * @param gpsManager for managing children objects.
     */
    GPSWorldHandler(GPSManager gpsManager) {
        gpsObjectList = new ArrayList<>();
        this.gpsManager = gpsManager;
    }

    /**
     * addsGPSObject only to list.
     *
     * @param gpsImageNode node
     */
    void addGPSObject(GPSImageNode gpsImageNode) {
        gpsObjectList.add(gpsImageNode);
    }

    /**
     * Adds object to both gpsmanager and the list.
     *
     * @param gpsImageNode node
     */
    void addGPSObjectCumilative(GPSImageNode gpsImageNode) {
        addGPSObject(gpsImageNode);
        gpsManager.getArWorld().addChild(gpsImageNode);
    }

    /**
     * Shows all objects in the list
     */
    public void showAll() {
        for (GPSImageNode gpsImageNode : gpsObjectList) {
            gpsImageNode.setVisible(true);
        }
    }

    /**
     * Hides all objects in the list.
     */
    void hideAll() {
        for (GPSImageNode gpsImageNode : gpsObjectList) {
            gpsImageNode.setVisible(false);
        }
    }

    /**
     * Shows a specific node in the list
     *
     * @param gpsImageNode node
     */
    void show(GPSImageNode gpsImageNode) {
        gpsImageNode.setVisible(true);
    }

    /**
     * Shows a specific node in the list by ID
     *
     * @param ID id of the node
     */
    public void show(String ID) {
        for (GPSImageNode gin : gpsObjectList) {
            if (gin.getID().equals(ID)) {
                show(gin);
            }
        }
    }

    /**
     * Hides a specific node in the list
     *
     * @param gpsImageNode node
     */
    void hide(GPSImageNode gpsImageNode) {
        gpsImageNode.setVisible(false);
    }

    /**
     * Hides a specific node in the list by ID
     *
     * @param ID id of the node
     */
    public void hide(String ID) {
        for (GPSImageNode gin : gpsObjectList) {
            if (gin.getID().equals(ID)) {
                hide(gin);
            }
        }
    }

    /**
     * Shows only a node in the list
     *
     * @param gpsImageNode node
     */
    public void showOnly(GPSImageNode gpsImageNode) {
        hideAll();
        gpsImageNode.setVisible(true);
    }

    /**
     * Shows only a node in the list by ID
     *
     * @param ID id of the node
     */
    public void showOnly(String ID) {
        hideAll();
        for (GPSImageNode gin : gpsObjectList) {
            if (gin.getID().equals(ID)) {
                show(gin);
            }
        }
    }

    /**
     * Gets the focused GPS Object in the list.
     *
     * @return focused gps object
     */
    GPSImageNode getFocusedGPSObject() {
        if (gpsObjectList.size() == 0)
            return null;

        float activeBearing = gpsManager.getBearingToNorth();

        GPSImageNode tmp = gpsObjectList.get(0);

        Log.d("TOUCH_EVENT", activeBearing + "");

        for (GPSImageNode gin : gpsObjectList) {
            Log.d("TOUCH_EVENT", gin.getID() + ": " + gin.getLastBearing());
            if (Math.abs(activeBearing - gin.getLastBearing()) < Math.abs(activeBearing - tmp.getLastBearing())) {
                tmp = gin;
            }
        }

        return tmp;
    }

    /**
     * Gets focused GPS object but it must be visible.
     *
     * @return Visible focused GPSObject
     */
    public GPSImageNode getFocusedVisibleGPSObject() {
        if (gpsObjectList.size() == 0)
            return null;

        float activeBearing = gpsManager.getBearingToNorth();

        GPSImageNode tmp = null;

        for (GPSImageNode gin : gpsObjectList) {
            if (gin.getVisible()) {
                tmp = gin;
                break;
            }
        }

        if (tmp == null)
            return null;

        Log.d("TOUCH_EVENT", activeBearing + "");

        for (GPSImageNode gin : gpsObjectList) {
            if (gin.getVisible()) {
                Log.d("TOUCH_EVENT", gin.getID() + ": " + gin.getLastBearing());
                if (Math.abs(activeBearing - gin.getLastBearing()) < Math.abs(activeBearing - tmp.getLastBearing())) {
                    tmp = gin;
                }
            }
        }

        return tmp;
    }
}
