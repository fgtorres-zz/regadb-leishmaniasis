package net.sf.regadb.db;


import java.util.HashSet;
import java.util.Set;

/**
 * Protein generated by hbm2java
 */
public class Protein implements java.io.Serializable {

    private Integer proteinIi;

    private int version;

    private OpenReadingFrame openReadingFrame;

    private String abbreviation;

    private String fullName;

    private int startPosition;

    private int stopPosition;

    private Set<SplicingPosition> splicingPositions = new HashSet<SplicingPosition>(
            0);

    public Protein() {
    }

    public Protein(OpenReadingFrame openReadingFrame, String abbreviation,
            int startPosition, int stopPosition) {
        this.openReadingFrame = openReadingFrame;
        this.abbreviation = abbreviation;
        this.startPosition = startPosition;
        this.stopPosition = stopPosition;
    }

    public Protein(OpenReadingFrame openReadingFrame, String abbreviation,
            String fullName, int startPosition, int stopPosition,
            Set<SplicingPosition> splicingPositions) {
        this.openReadingFrame = openReadingFrame;
        this.abbreviation = abbreviation;
        this.fullName = fullName;
        this.startPosition = startPosition;
        this.stopPosition = stopPosition;
        this.splicingPositions = splicingPositions;
    }

    public Integer getProteinIi() {
        return this.proteinIi;
    }

    public void setProteinIi(Integer proteinIi) {
        this.proteinIi = proteinIi;
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public OpenReadingFrame getOpenReadingFrame() {
        return this.openReadingFrame;
    }

    public void setOpenReadingFrame(OpenReadingFrame openReadingFrame) {
        this.openReadingFrame = openReadingFrame;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStartPosition() {
        return this.startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getStopPosition() {
        return this.stopPosition;
    }

    public void setStopPosition(int stopPosition) {
        this.stopPosition = stopPosition;
    }

    public Set<SplicingPosition> getSplicingPositions() {
        return this.splicingPositions;
    }

    public void setSplicingPositions(Set<SplicingPosition> splicingPositions) {
        this.splicingPositions = splicingPositions;
    }

}