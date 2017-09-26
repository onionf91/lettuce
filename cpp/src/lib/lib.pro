CONFIG(debug, debug|release) {
    DESTDIR     = $$OUT_PWD/build-debug
    OBJECTS_DIR = $$OUT_PWD/build-debug/.obj
    MOC_DIR     = $$OUT_PWD/build-debug/.moc
}
CONFIG(release, debug|release) {
    DESTDIR     = $$OUT_PWD/build-release
    OBJECTS_DIR = $$OUT_PWD/build-release/.obj
    MOC_DIR     = $$OUT_PWD/build-release/.moc
}

QT       -= core gui

TARGET = engine
TEMPLATE = lib
CONFIG += staticlib

# The following define makes your compiler emit warnings if you use
# any feature of Qt which has been marked as deprecated (the exact warnings
# depend on your compiler). Please consult the documentation of the
# deprecated API in order to know how to port your code away from it.
DEFINES += QT_DEPRECATED_WARNINGS

# You can also make your code fail to compile if you use deprecated APIs.
# In order to do so, uncomment the following line.
# You can also select to disable deprecated APIs only up to a certain version of Qt.
#DEFINES += QT_DISABLE_DEPRECATED_BEFORE=0x060000    # disables all the APIs deprecated before Qt 6.0.0

SOURCES += \
        engine.cpp

HEADERS += \
        engine.hpp
