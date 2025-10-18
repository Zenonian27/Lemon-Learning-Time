$inputFolder  = "D:\SteamLibrary\steamapps\common\My Summer Car\Radios"
$outputFolder = "D:\SteamLibrary\steamapps\common\My Summer Car\Radio"

# make sure the output folder exists
New-Item -ItemType Directory -Force -Path $outputFolder

foreach ($f in Get-ChildItem "$inputFolder\*.mp3") {
    $outFile = Join-Path $outputFolder ($f.BaseName + ".ogg")
    ffmpeg -i $f.FullName -c:a libvorbis $outFile
}
