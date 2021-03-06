package awais.instagrabber.repositories.responses;

import java.io.Serializable;
import java.util.Objects;

public class Location implements Serializable {
    private final long pk;
    private final String shortName;
    private final String name;
    private final String address;
    private final String city;
    private final float lng;
    private final float lat;

    public Location(final long pk,
                    final String shortName,
                    final String name,
                    final String address,
                    final String city,
                    final float lng,
                    final float lat) {
        this.pk = pk;
        this.shortName = shortName;
        this.name = name;
        this.address = address;
        this.city = city;
        this.lng = lng;
        this.lat = lat;
    }

    public long getPk() {
        return pk;
    }

    public String getShortName() {
        return shortName;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public float getLng() {
        return lng;
    }

    public float getLat() {
        return lat;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Location location = (Location) o;
        return pk == location.pk &&
                Float.compare(location.lng, lng) == 0 &&
                Float.compare(location.lat, lat) == 0 &&
                Objects.equals(shortName, location.shortName) &&
                Objects.equals(name, location.name) &&
                Objects.equals(address, location.address) &&
                Objects.equals(city, location.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk, shortName, name, address, city, lng, lat);
    }
}
