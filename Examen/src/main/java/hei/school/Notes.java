package hei.school;

import java.time.Instant;
import java.util.List;

public class Notes {
    private final Examen notes;
    private final int initialValues;
    private final List<History> histories;
    private final String changementDescription;

    public Notes(Examen notes, int initialValues, List<History> histories, String changementDescription) {
        this.notes = notes;
        this.initialValues = 0;
        this.histories = histories;
        this.changementDescription = changementDescription;
    }

    public Examen getNotes() {
        return notes;
    }

    public int getInitialValues() {
        return initialValues;
    }

    public List<History> getHistories() {
        return histories;
    }

    public String getChangementDescription() {
        return changementDescription;
    }


}
