SUMMARY = "dsd"
LICENSE = "BSD-0-Clause"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=7fc5448b0a331ee10861d714d7798965"

SRC_URI = "git://github.com/szechyjs/dsd.git;protocol=https"
SRCREV = "f175834e45a1a190171dff4597165b27d6b0157b"

S = "${WORKDIR}/git"

DEPENDS += "alsa-lib fftw lapack portaudio-v19 itpp mbelib"

inherit cmake pkgconfig

